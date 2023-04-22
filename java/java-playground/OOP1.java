package com.company;
import java.util.Scanner;
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class OOP1 {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.salary=250;
        System.out.println(obj.getSalary());
        obj.setName("Arnab Dey");
        System.out.println(obj.getName());
    }
}
