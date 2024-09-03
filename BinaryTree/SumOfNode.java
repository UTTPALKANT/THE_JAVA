
package BTrees;
public class SumOfNode {
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
    public static int SumOfNode(Node root){
        if(root == null){
            return 0;
        }
        int leftSumOfNode=SumOfNode(root.left);
        int rightSumOfNode = SumOfNode(root.right);
        return leftSumOfNode+rightSumOfNode+root.data;
    }
    public static void main(String[] args) {
       Node root =new Node(1);
       root.left =new Node(2);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right=new Node(3);
      // root.right.right=new Node(7);
       root.right.left=new Node(6);
       System.out.println(SumOfNode(root)+" is total sum of Node in Binary treee");



    }
}