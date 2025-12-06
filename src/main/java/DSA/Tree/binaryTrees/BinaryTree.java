/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.Tree.binaryTrees;

/**
 *
 * @author humai
 */
public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        this.root=null;
    }
    
    public void preOrderTT(Node node){
        if (node==null) {
            return;
        }
        System.out.print(node.data+" ");
        preOrderTT(node.left);
        preOrderTT(node.right);
    }
    
    public void InOrderTT(Node node){
        if (node==null) {
            return;
        }
        
        InOrderTT(node.left);
        System.out.print(node.data+" ");
        InOrderTT(node.right);
    }
    
    public void postOrderTT(Node node){
        if (node==null) {
            return;
        }
        
        postOrderTT(node.left);
        postOrderTT(node.right);
        System.out.print(node.data+" ");
        
    }
}
