package BTrees;

public class Height {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    // height method
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight= height(root.left);
        int rightHeight= height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.left.left.right=new Node(5);
        System.out.print("Height of Binary tree is:");
       System.out.println(height(root));

    }
}
