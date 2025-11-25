/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.LogicBuildingProblems;

import java.util.Scanner;

/**
 *
 * @author humai
 */
public class methods {
    private int[] arr;
    private int count=0;
    public methods(int num){
        this.arr = new int[num];
    }
    
    public void insertArray(int item){
        arr[count++]=item;
        if (count==arr.length) {
            int temp[] = new int[count*2];
            for (int i = 0; i < count; i++) {
                temp[i]=arr[i];
            }
            arr=temp;
        }
        
    }
    
    public void displayArray(){
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


