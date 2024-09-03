package BTrees;

public class IsAsubtree {
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

        // isIdentical
        public static boolean isIdentical(Node node , Node subroot)
        {
            //base case
            if(node == null && subroot == null)
            {
                return true;
            }
            else if(node == null || subroot== null || node.data != subroot.data )
            {
                return false;
            }
            if( !isIdentical(node.left, subroot.left))
            {
                return false;
            }
            if(!isIdentical(node.right, subroot.right))
            {
                return false;
            }
            else
            return true;            
        }
        // isSubtree
        public static boolean isSubtree(Node root , Node subRoot)
        {
            if(root == null)
            {
                return false;
            }
            if(root.data == subRoot.data)
            {
                if(isIdentical(root, subRoot))
                {
                    return true;
                }
            }
            return isIdentical(root.left, subRoot.left) || isIdentical(root.right, subRoot.right);
            }
  
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(6);

        Node subroot = new Node(2);
        subroot.left= new Node(4);
        subroot.right= new Node(5);
        System.out.println(isSubtree(root, subroot));
    
}
}
