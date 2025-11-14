/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.OOPs.inheritence;

/**
 *
 * @author humai
 */
public class book extends challenge1 {
    int isbn;
    public book(int itemID, String title, String author, int isbn) {
        super(itemID, title, author);
        this.isbn=isbn;
    }

    @Override
    public void checkout() {
        super.checkout(); 
        System.out.println("ISBN"+this.isbn);
    }
    
    
    public static void main(String[] args) {
        book obj = new book(1,"Fourty rules of love","MarkManson",1234);
        challenge1 obj1 = new challenge1(2,"computing","xyz");
        obj.checkout();
        System.out.println("");
        obj.checkout();
        System.out.println("");
        obj1.checkout();
        System.out.println("");
        obj1.returnItem();
    }
}
