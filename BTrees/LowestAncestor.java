package BTrees;

public class LowestAncestor {
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
public static void main(String[] args) {
    Node root = new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left= new Node(4);
    root.left.right = new Node(5);
    root.right.left =new Node(6);
    root.right.right = new Node(7);
    int n1=4,  n2=5;
}
}
