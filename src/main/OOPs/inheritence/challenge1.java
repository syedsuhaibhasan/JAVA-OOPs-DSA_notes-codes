package com.javaoop.mavenproject2.OOPs.inheritence;
public class challenge1 {
    int itemID;
    String title;
    String author;
    boolean isBorrowed;
    int noOfBooks,count=10;
    
    public challenge1(int itemID,String title, String author){
    this.title=title;
    this.itemID=itemID;
    this.author=author;
    }
    
    public void checkout(){
        if (isBorrowed) {
            System.out.println("Sorry not available");
        }else{
            this.isBorrowed=true;
        System.out.println("Checkout Confirmed Book Borrowed.");
        System.out.println("BOOK DETAILS");
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Item ID: "+this.itemID);
        count--;}
    }
    
    public void returnItem(){
        System.out.println("Return Confirmed.");
        System.out.println("BOOK DETAILS");
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Item ID: "+this.itemID);
        count++;
    }
    
    public int getTotalNoOfBooks(){
    return noOfBooks;
    }
    
    public int getNoOfAvailableBooks(){
    return count;
    }
}
