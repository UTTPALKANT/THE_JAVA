package BTrees;

public class kthLevel {
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data ;
            this.left=left;
            this.right=right;
        }
     }
     // kth level method!
     public static void kthlevelValue (Node root, int level, int k){
        // base case
        // compare level with key
        // call for lweft subtrees and right subtree!
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        kthlevelValue(root.left, level+1, k);
        kthlevelValue(root.right, level+1, k);
     }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left= new Node(4);
        root.left.right = new Node(5);
        root.right.left =new Node(6);
        root.right.right = new Node(7);
        kthLevel.kthlevelValue(root, 1,3);

        
    }
}
