package com.company;

public class CheckSort {
    public static void main(String[] args) {
        int[] arr={23,67,82,41,79,85,90,12,61,97,79,57};
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        boolean sort=true;
        for(int i=0;i<arr1.length;i++){
            for(int j=i;j<arr1.length;j++){
                if(!(arr1[i]<=arr1[j])) {
                    sort = false;
                    break;
                }
            }
            if(!sort)
                break;
        }
        if(!sort)
            System.out.println("Not sorted");
        else
            System.out.println("Sorted");
    }
}
