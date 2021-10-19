package com.company;

public class DecimaltoBinaryConversion {
    static void DecToBinary() {
        int x = 15;
        int remainder[] = new int[40];
        int index = 0;
        while (x > 0) {
            remainder[index++] = x%2;
            x = x/2;

        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(remainder[i]);
        }

    }
    public static void main(String[] args) {
        DecToBinary();
    }
}
