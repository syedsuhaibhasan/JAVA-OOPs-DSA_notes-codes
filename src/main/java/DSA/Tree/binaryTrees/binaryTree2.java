package DSA.Tree.binaryTrees;

import java.util.Scanner;

/*
My own work
*/
public class binaryTree2 {
    
    public binaryTree2(){}
    
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value=value;  
        }        
    }
    
    private Node root;
    //insert elements
    //this takes the first root node
    public void populate(Scanner scanner){
        System.out.println("Enter the root node:" ); 
        int value = scanner.nextInt();
        root = new Node(value);
        //when a new node is successfully inserted it calls its helper function
        populate(scanner, root);
    }
    
    private void populate(Scanner scanner, Node node){
        //ask where do you want to add?
        System.out.println("Do you want to enter left of " + node.value);
        boolean left  = scanner.nextBoolean();
        //if user says yes
        if (left) {
            //takes a integer value store it in value
            System.out.println("Enter the value: ");
            int value = scanner.nextInt();
            //now the root left pointer, points to a new node
            //that has integer value given in line number 41
            node.left = new Node(value);
            //now again recursion call is made, but now for new node that 
            //has bee ninserted at the left of root node
            populate(scanner,node.left);
        }
        
        System.out.println("Do you want to enter right of " + node.value);
        boolean right  = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value: ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }
    
     public void preOrder(Node node){//NLR
         if (node==null) {
             return;
         }
         
         System.out.println(node.value + " ");
         preOrder(node.left);
         preOrder(node.right);
     }
     
     public void inOrder(Node node){ //LNR
         if (node==null) {
             return;
         }
         
         inOrder(node.left);
         System.out.println(node.value +  " ");
         inOrder(node.right);
     }
     
     public void postOrder(Node node){ //LRN
         if (node==null) {
             return;
         }
         
         postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
     }
     
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binaryTree2 obj = new binaryTree2();
        obj.populate(scanner);
        obj.preOrder(obj.root);
    }
}
