/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.OOPs.encapsulation;

/**
 *
 * @author humai
 */
public class Book {
    //variables
    String title,author,isbn;
    boolean isBorrowed;
    static int totalbooks;
    //constructor
    Book(String title,String author,String isbn){
    this.title=title;
    this.author=author;
    this.isbn=isbn;}
    
    static{
     totalbooks=0;
    }
    
    {
        totalbooks++;
    }
    //static mehtod
    public static int getTotalbooks(){
    return totalbooks;
    }
    
    public void BorrowBook(){
    if(isBorrowed){System.out.println("The book is already borrowed.");
    }else{
        this.isBorrowed=true;
        System.out.println("Enjoy the book");
    totalbooks--;}
    }
    
    public void Returnbook(){
        if (isBorrowed) {
            this.isBorrowed=false;
            System.out.println("Thankyou for returning the book, please leave a review.");
            totalbooks++;
        }else{
            System.out.println("The book is already in the catalog. ");}
}
    
    public static void main(String[] args) {
        Book book = new Book("Anything","sohaib","123");
         Book book1 = new Book("Anythin","sohaih","124");
          Book book2 = new Book("Anthing","sohib","183");
        System.out.println(Book.getTotalbooks());
        book.BorrowBook();
        System.out.println(Book.getTotalbooks());
        book1.BorrowBook();
        System.out.println(Book.getTotalbooks());
        book2.BorrowBook();
        System.out.println(Book.getTotalbooks());
        book.BorrowBook();
        book1.Returnbook();
        book2.Returnbook();
        book1.Returnbook();
    }
}
