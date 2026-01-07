package BinarySearchTree;

import java.util.ArrayList;

public class RootToLeafPaths {
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
public static void printToLeaf(Node root, ArrayList<Integer> path){
    if(root==null)return ;
  
    path.add(root.data);
    //leaf
      if(root.left==null &&root.right==null){
        printPath(path);
      }
      else{ // non leaf
    printToLeaf(root.left, path);
    printToLeaf(root.right, path);
}
path.remove(path.size()-1);
}
public static void printPath(ArrayList<Integer>path){
    for (int i=0;i<path.size();i++) {
        System.out.print(path.get(i)+"->");
    }
    System.out.println();
}
public static void main(String[] args) {
         int []values={8,5,3,4,6,1,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=buildTree(root,values[i]);
        }
        inorder(root);
        System.out.println();
        printToLeaf(root, new ArrayList<>());
    }
}
