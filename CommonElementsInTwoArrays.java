package com.company;

public class CommonElementsInTwoArrays {
    public static void main (String[] args)  {
        int a [] = {1,5,6,9,1,4};
        int b [] = {5,6,7,0,2};
        for (int i = 0; i< a.length; i++) {
            for (int j = 0; j< b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
