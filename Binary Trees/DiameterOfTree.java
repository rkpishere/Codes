public class DiameterOfTree {
     static class Node{
        int data;
        Node left;
        Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    }
    static class Tree{
        static int idx=-1;
         public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);
            return newnode;

         }
    }
    public static int depthOfTree(Node root){
    if(root==null){
        return 0;
    }
    int leftHeight=depthOfTree(root.left);
    int rigthHeight=depthOfTree(root.right) ; 
   int height =Math.max(leftHeight,rigthHeight)+1;
return height;
   }
   // Big O(n^2) Approach 1
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=depthOfTree(root.left)+depthOfTree(root.right)+1;
        return Math.max(diam3,Math.max(diam1, diam2));
    }
    // Big O(n) Approach 2
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null){
           return  new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myheight=Math.max(left.ht,right.ht)+1;
        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;
        int mydiam=Math.max(Math.max(diam1,diam2),diam3);
    TreeInfo myInfo=new TreeInfo(myheight,mydiam);
    return myInfo;
    }

     @SuppressWarnings("static-access")
    public static void main(String[] args) {
         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree t=new Tree();
        Node root=t.buildTree(nodes);
     System.out.println(diameter2(root).diam);

     }
}
