package BTrees;

public class Preorder_BT {

    //Node class to define the root data , left subtree, and right subTree:
    public static class Node{
        int parent;
        Node left;
        Node right;
        //constructor to initialize all properties
        Node (int parent){
            this.parent=parent;
            this.left=left;
            this.right=right;
        }
    }

    // create  static class of Binary Tree to give structure
     static class BinaryTree{
         
         static int idx =-1;// let first node == null;
         // method to implement all function
         public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){ //base case
                return null;
            }
            Node newNode =new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes); // it will work recursively!
            return newNode;
        }
        // preorder
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.parent+" ");
            preorder(root.left);
            preorder(root.right);
        }
     } 
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,9,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.parent);
        tree.preorder(root);

    }
}
