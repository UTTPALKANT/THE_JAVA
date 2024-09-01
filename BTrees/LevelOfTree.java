package BTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOfTree {
    static class Node {
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=left;
            this.right= right;
        }
    }
    public static class Bt{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode =newNode.left;
            newNode =newNode.right;
            return newNode;
        }
        //level of tree
        public static void levelOfTree(Node root){
            if(root == null){
               return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
    
            //looping till q not empty!
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                     
                if(q.isEmpty()){
                    break;
                }    
                else{
                    q.add(null);
                }  
            }
            else{
                System.out.println(root.data+" ");
                if(currNode.left !=null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    }
    public static void main(String[] args) {
        // System.out.println("Enter your node value!");
        // Scanner sc=new Scanner(System.in);
        // int nodes[]=new int[10];
        // nodes[10]=sc.nextInt();
        int nodes[]={1,2,4,-1,-1,5,-1,-1,9,-1,-1};

        Bt tree=new Bt();
        Node root=tree.buildTree(nodes);
        tree.levelOfTree(root);
    }
    
}
