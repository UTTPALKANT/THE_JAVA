package BTrees;

public class CountNode {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.left=left;
            this.data=data;
            this.right=right;
        }
    }
    // method to print countOfNode;
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int leftCount=countNode(root.left);
        int rightCount = countNode(root.right);
        return leftCount+rightCount+1;
    }
    public static void main(String[] args) {
       Node root =new Node(1);
       root.left =new Node(2);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right=new Node(3);
       root.right.right=new Node(7);
       root.right.left=new Node(6);
       System.out.println(countNode(root)+" is total number of Node in Binary treee");



    }
}
