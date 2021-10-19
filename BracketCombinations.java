package com.company;

import java.util.ArrayList;

public class BracketCombinations {

    // Function to print the output
    static void printTheArray(String arr[], int n)
    {
        System.out.print("T" + " ");
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++)

        {
            list.add(arr[i]);
            System.out.print( arr[i]+ " ");
        }
        System.out.print("F");
        System.out.println();
        System.out.println(list);
        filterArray(list);
    }

    // Function to generate all binary strings
    static void generateAllBinaryStrings(int n,
                                         String arr[], int i)
    {
        if (i == n)
        {
            printTheArray(arr, n);
            return;
        }

        // First assign "0" at ith position
        // and try for all other permutations
        // for remaining positions
        arr[i] = "T";
        generateAllBinaryStrings(n, arr, i + 1);

        // And then assign "1" at ith position
        // and try for all other permutations
        // for remaining positions
        arr[i] = "F";
        generateAllBinaryStrings(n, arr, i + 1);
    }
    static void filterArray (ArrayList list ){

        int countT = 0;
        int countF = 0;
        for (int i = 0 ; i < list.size() ; i ++) {
            if (list.get(i) == "T" ) {
                countT++;
            }
            if (list.get(i) == "F" ) {
                countF++;
            }

        }
        for (int i = 0 ; i < list.size() ; i ++) {
            if (countF != countT) {
                list.remove(list.get(i));
            }
            System.out.println(list);

        }

    }

    // Driver Code
    public static void main(String args[])
    {
        int n = 2;

        String[] arr = new String[n];

        // Print all binary strings
        generateAllBinaryStrings(n, arr, 0);

        Calculator myCal = new Calculator();
        System.out.println(myCal.r);
       System.out.println(myCal.calculateCombinations(4 , 5 , "+"));


    }
}







