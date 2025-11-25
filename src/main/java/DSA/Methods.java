/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA;
import java.util.Scanner;
/**
 *
 * @author humai
 */
public class Methods {
    private int arr[];
    public Methods(int size){
        this.arr=new int[size];
    }
    
    public void insertArray(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter a integer value at " + (i+1) + " index of array: ");
            arr[i]=sc.nextInt();
      }
    }
    
    public void displayarray(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public void bubblesort(){
        for (int j = 0; j < arr.length-1; j++) {    
            for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
               int temp = arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
            }
         }
      } 
    }
    
    public int binarySearch(int target){
    int start = arr[0];
    int end = arr.length-1;
    while(start<=end){
    int mid = start+(end-start)/2;
        if (target<arr[mid]) {
            end = mid-1;
        }
        else if (target>arr[mid]) {
            start = mid+1;
        }
        else 
            return mid;
    }
    return -1;
    }
}
