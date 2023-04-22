package com.company;

import java.util.Scanner;

class Circle{
    double radius;
    double area, volume;
    final double pi=3.14;
    Circle(){
        this.radius=0;
        this.area=0;
        this.volume=0;
    }
    Circle(double r){
        this.radius=r;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = pi*radius*radius;
    }
}
class Cylinder extends Circle{
    double height;
    Cylinder(double r,double h){
        super(r);
        this.height=h;
    }
    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = (2 * pi * radius * radius) + (2 * pi * radius * height);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume() {
        this.volume = pi*radius*radius*height;
    }

}
public class Shapes {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Circle obj=new Circle(sc.nextInt());
        obj.setArea();
        System.out.println("The area is:"+obj.getArea());
        Cylinder ob=new Cylinder(sc.nextDouble(),sc.nextDouble());
        ob.setArea();
        ob.setVolume();
        System.out.println("The area is:"+ob.getArea());
        System.out.println("The volume is:"+ob.getVolume());
    }
}
