package com.company;

public class Letterspaheli {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){


            for(int j=1;j<=9;j++){


                for(int k=1;k<=9;k++){

                    if(k+101*i==90*j){
                        System.out.println(i+" "+j+" "+k);
                        System.out.println("The product is:"+(i*j*k));
                    }
                }
            }
        }
    }
}
