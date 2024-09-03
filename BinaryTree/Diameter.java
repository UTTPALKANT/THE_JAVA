package BTrees;
public class Diameter
{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    //height of node!
    public static int height(Node root )
    {
        if(root == null)
        return 0;
        int leftH = height(root.left);
        int rightH = height(root.right);
        // return leftH+rightH+1; (Wrong)           // 1 is Nodes its self  ( give wrong ans ) Q_ki it simple add L_h +  R_H + Node
        return Math.max(leftH, rightH)+1;// it is correct 
    }

    // DIAMETER OF BINARY_TREE
    public static int diameter(Node root)
    {
        if(root == null)
        return 0;
        int leftDiameter =diameter(root.left);
        int rightDiameter = diameter(root.right);
         int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight+rightHeight+1;

        return Math.max(selfDiameter, Math.max(rightDiameter, leftDiameter));

    }
    public static void main(String[] args) {
        Node root =new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right =new Node(5);
         root.right.left= new Node(7);
         root.right.right =new Node(6);
         System.out.println(height(root)+" is height of BinaryTree");
         System.out.println();
         System.out.println(diameter(root)+" is diameter of Binary tree ");

        
    }
}