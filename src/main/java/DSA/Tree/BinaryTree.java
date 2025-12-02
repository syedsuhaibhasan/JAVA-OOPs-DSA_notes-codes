/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.Tree;

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
}
