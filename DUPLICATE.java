package com.company;

import java.util.Scanner;

public class DUPLICATE {
    public static void main(String srgs[]) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the word");
        String a= x.nextLine();
        int count=0;
        char[] s = a.toCharArray();
        for (int i =0; i<a.length();i++){
            count =1;
            for (int j=i+1;j<a.length();j++){
                if(s[i]==s[j]) {
                    count++;
                    s[j]='@';
                }
            }                 System.out.println(count);

            if(count>1&&s[i]!='@')
            {
                System.out.println(s[i]);
            }
        }
    }
}
