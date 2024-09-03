package BTrees;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree {
    // node class
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
    //static class for binary tree!
    static class BinaryTree{
        //method to return root node
        static  int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;   
        }
        //preorder traversal:
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        //inorder
        public static void inorder(Node root){
            //base case
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        //postorder
        public static void postorder(Node root){
            //base case
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        // method to treverse the Binary three
         public static void treeTraversal(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
    
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
                else {
                System.out.print(currNode.data+" ");
                
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    }

    

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,9,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data+"// it is root node value");
        System.out.println("************ preorder tree ***********");
        tree.preorder(root);
        System.out.println();
        System.out.println("************ inorder tree ***********");
        tree.inorder(root);
        System.out.println();
        System.out.println("************ postorder tree ***********");
        tree.postorder(root);
        System.out.println();
        System.out.println("************ tree traverse *****");
        tree.treeTraversal(root);

        
    }
}
