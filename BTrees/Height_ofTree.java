package BTrees;

public class Height_ofTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    //Hight method
    public static int hightTree(Node root){
        if(root == null){
            return 0;
        }
        int lh=hightTree(root.left);
        int rh=hightTree(root.right);
        return Math.max(lh, rh)+1;
    }
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left= new Node(2);
        root.left.left=new Node(4);
        root.right=new Node(3);
        root.left.right= new Node(5);
        root.left.right.left= new Node(6);
        root.left.right.right= new Node(7);
        hightTree(root);
    }
}
