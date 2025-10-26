/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.OOPs;

/**
 *
 * @author humai
 */
public class Course {
    String courseName;
    String[] enrolledStudents;
    int currentlyenrolled=0;
    static  int maxCapacity;
    
    {
        currentlyenrolled++;
    }
    
    Course(String courseName){
    this.courseName=courseName;
    enrolledStudents = new String[maxCapacity];
    }
    
    public static void setMaxCapacity(int capacity){
     maxCapacity = capacity;
    }
    
    public void enrollstudent(String studentName){
        if (maxCapacity>currentlyenrolled) {
            enrolledStudents[currentlyenrolled]=studentName;
            System.out.println("The student has successfully enrolled.");
            currentlyenrolled++;
        }else{
            System.out.println("The course has reached its maximum capacity");}
    }
    
    public void unenrollstudent (String studentName){
        boolean found=false;
        for (int i = 0; i < currentlyenrolled; i++) {
            if (enrolledStudents[i] != null && enrolledStudents[i].equals(studentName)) {
                for (int j = i; j < currentlyenrolled-1 ; j++) {
                    enrolledStudents[j]=enrolledStudents[j+1];
                }
            enrolledStudents[currentlyenrolled-1]=null;
            found=true;
            currentlyenrolled--;
            break;
            }
        }
        if (!found) {
        System.out.println("Student not found.");
        }
    }   
        
    public static void main(String[] args) {
       Course.setMaxCapacity(3);
       
    Course course1 = new Course("DLD");
    Course course2 = new Course("OOP");

    course1.enrollstudent("Sohaib");
    course1.enrollstudent("Aliza");
    course1.enrollstudent("Ibrahim");
    course1.enrollstudent("Extra"); // Should show capacity full

    course1.unenrollstudent("Aliza");
    course1.unenrollstudent("Unknown"); // Should show not found
    }
}
