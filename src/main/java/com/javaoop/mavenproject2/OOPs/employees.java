/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.OOPs;

/**
 *
 * @author humai
 */
public class employees {

    public employees(int salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int salary,age;
    private String name;
    
    String employeedetails(){
    return "Name:"+name+" ,Age"+age+" ,Salary:"+salary;
    }
}
