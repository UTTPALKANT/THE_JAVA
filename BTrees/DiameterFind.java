package BTrees;

public class DiameterFind {
   public  static class Node
   {
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        this.left=left;
        this.right=right;
    }
    
   }
   // cal Height of Node:
   public static int height(Node root)
   {
    if(root == null)
    {
        return 0;
    }
    int lh= height(root.left);
    int rh= height(root.right);

    return Math.max(lh, rh)+1;
   }
   // Cal diameter
   public static int diameter(Node root)
   {
    if(root == null)
    {
    return 0;
    }
    int ld = diameter(root.left);
    int rd = diameter(root.right);
    int lh = height(root.left);
    int rh = height(root.right);

    int rootDiam = lh+rh+1;

    return Math.max(Math.max(ld,rd), rootDiam);
    
   }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
        //height(root);
        System.out.println(height(root)+" height of Binary tree ");
        System.out.println(diameter(root)+" Diameter of Binary tree ");
        
    }
}
