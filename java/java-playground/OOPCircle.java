package com.company;
import java.util.Scanner;
public class OOPCircle {
    static Scanner sc;
    private double radii;
    private double area;
    double pi=3.14;
    public void setRadii(double r){
        radii=r;
    }
    public double getRadii(){
        return radii;
    }
    public double getArea(){
        area=pi*radii*radii;
        return area;
    }


    public static void main(String[] args) {
        sc=new Scanner(System.in);
        OOPCircle ob=new OOPCircle();
        System.out.println("Enter radius:");
        int r=sc.nextInt();
        ob.setRadii(r);
        System.out.println("Area:"+(ob.getArea()));
    }

}
