package BTrees;

public class PostorderBT {
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
    public static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        //postorder
        public static void postorder(Node root){
            if(root == null){
                return ;

            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,9,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println();
        System.out.println("********** postorder tree ********");
        tree.postorder(root);
    }
}
