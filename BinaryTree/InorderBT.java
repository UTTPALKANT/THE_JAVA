package BTrees;
public class InorderBT{
    static class Node{
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }

    }
    public static class BinaryTree{
       static  int idx=-1;
       public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right= buildTree(nodes);
        return newNode;
       }
       //inorder
       public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
       }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,9,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print("Root node value: "+root.data+" ");
        System.out.println();
        System.out.println("*************** inorder *********");
        tree.inorder(root);
    }
}