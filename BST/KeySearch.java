package BST;

public class KeySearch{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left = left;
            this.right = right;

        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root= new Node(val);
            return root;
        }
        if(root.data > val){
            // left sutree
            root.left =insert(root.left, val);
        }
        else{
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder (Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
        //System.out.println(root.data+" ");
    }
    public static boolean key_Search(Node root, int key ){
        if( root == null){
            return false;
        }
        if(root.data == key){
            return key_Search(root.left, key);
        }
        else
        {
            return key_Search(root.right, key);

        }
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i= 0;i<values.length;i++){
            root = insert(root,values [i]);
        }
        inorder(root);
        System.out.println();
        if(key_Search(root, 5)){
                System.out.println("fond key");
            }
            else
            System.out.println("Not matched key!");
        }
        
    }

