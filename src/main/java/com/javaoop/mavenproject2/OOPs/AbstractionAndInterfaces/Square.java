package com.javaoop.mavenproject2.OOPs.AbstractionAndInterfaces;
public class Square extends Challenge1 {
    double length,breath,height,width;

    public Square(double length, double breath, double height, double width) {
        this.length = length;
        this.breath = breath;
        this.height = height;
        this.width = width;
    }
    
    @Override
    public void calculateArea() {
        double Area = length*breath*height*width;
        System.out.println(Area);
    }
    
    public static void main(String[] args) {
        Square obj = new Square(3,2,1,8);
        obj.calculateArea();
    }
}
