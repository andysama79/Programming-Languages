package com.company;
class CellPhone {
    public void ringing() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling Friend...");
    }
}
public class OOP2 {
    public static void main(String[] args) {
        CellPhone asus=new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ringing();

    }
}
