public class CountOfNodesInTree {
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
    public static int countNodes(Node root) {
        if(root==null){
            return 0;
        }
    int leftNode=countNodes(root.left);
    int rightNode=countNodes(root.right);
        return leftNode+rightNode+1;
    }
    @SuppressWarnings("static-access")
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree t=new Tree();
        Node root=t.buildTree(nodes);
        //System.out.println(root.data);
        System.out.println(countNodes(root));
    }
}
