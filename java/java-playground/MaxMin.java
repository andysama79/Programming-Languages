package com.company;

public class MaxMin {
    public static void main(String[] args) {
        int max,min;
        int[] arr={23,67,82,41,79,85,90,12,61,97,79,57};
        max=arr[0];
        min=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println(min+" "+max);
    }
}
