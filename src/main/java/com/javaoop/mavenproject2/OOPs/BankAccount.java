/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.OOPs;

/**
 *
 * @author humai
 */
public class BankAccount {
   private int accountbalance=0,accountNumber,cash;
   private String accountholder;
   
   public int withdraw(int cash){
       if (cash>0&&accountbalance>=cash) {
        accountbalance-=cash;
        System.out.printf("Cash %d withdrawed successfully",cash);
       }else{
           System.out.println("Insufficient balance");
       }
          return accountbalance;
   }
   
   public int deposit(int cash){
       System.out.println("Enter the amount you want to deposit: ");
       accountbalance+=cash;
       System.out.println("Cash deposited successfully,updated balance: ");
       return accountbalance;
   }
   
    public static void main(String[] args) {
        BankAccount bankaccount = new BankAccount();
        int deposit = bankaccount.deposit(100);
        System.out.println("Balance after deposit: " + deposit);

        int withdrawn = bankaccount.withdraw(1000);
        System.out.println("Balance after withdrawal: " + withdrawn);

        System.out.println("Paisa left: " + bankaccount.accountbalance);
    }
}