/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.stacks;

/**
 *
 * @author humai
 */
public class polish_notation {
    public static void main(String[] args) {
        String exp = "[A+B]"; 
         polish_notations_inffix_postfix_conversion con = new  polish_notations_inffix_postfix_conversion(exp.length());
         con.infixToPostfix(exp);
         System.out.println(exp);
         con.print();
    }
}
