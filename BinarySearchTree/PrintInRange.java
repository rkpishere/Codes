package BinarySearchTree;

public class PrintInRange {
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
    public static Node buildTree(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
         if(root.data>val){
            //leftSubtree
          root.left=  buildTree(root.left, val);
         }
         else{
            root.right=buildTree(root.right, val);
         }
         return root;
    }
    public static void inorder(Node root){
    if(root==null)return ;
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
public static void inRange(Node root,int x , int y){
    if(root==null){
        return;
    }
    if(root.data>=x && root.data<=y){
        inRange(root.left, x, y);;
        System.out.print(root.data+" ");
        inRange(root.right, x, y);
    }
    else if(root.data>=y){
        inRange(root.left, x, y);
    }
    else{
        inRange(root.right, x, y);
    }
}
    public static void main(String[] args) {
         int []values={8,5,3,4,6,1,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=buildTree(root,values[i]);
        }
        inorder(root);
        System.out.println();
        inRange(root, 1, 4);
        //inorder(root);

    }
}
