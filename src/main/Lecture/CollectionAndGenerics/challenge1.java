/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.CollectionAndGenerics;

/**
 *
 * @author humai
 */
public class challenge1 {
    int a;
    public static void main(String[] args) {
         System.out.println(concatinate("Syed","Muhammad","Sohaib","Hasan"));
    }
    
    public static String concatinate(String... str){
         StringBuilder sb = new StringBuilder();
        for (String strs: str) {
            sb.append(strs).append(" ");
        }
        return sb.toString();
    }
}
