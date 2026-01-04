public class Sum_of_Nodes {
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
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumOfNodes(root.left);
        int rightsum=sumOfNodes(root.right);
       
       return leftsum+rightsum+root.data;
    }
    
     @SuppressWarnings("static-access")
    public static void main(String[] args) {
         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree t=new Tree();
        Node root=t.buildTree(nodes);
       int totalsum= sumOfNodes(root);
       System.out.println(totalsum);
        
     }
}
