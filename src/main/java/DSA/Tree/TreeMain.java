/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.Tree;

/**
 *
 * @author humai
 */
public class TreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        Node six = new Node(60);
        Node seven = new Node(70);
        Node eight = new Node(80);
        
        tree.root=first;
        tree.root.left=second;
        tree.root.right=third;
        tree.root.left.left=four;
        tree.root.left.right=five;
        tree.root.right.left=six;
        tree.root.right.right=seven;
        tree.root.left.left.left=eight;
        
        System.out.println("");
        System.out.println("Pre-Order Tree Traversal");
        tree.preOrderTT(tree.root);
    }
}
