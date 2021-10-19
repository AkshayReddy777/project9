package com.company;

  public class Calculator {
    private int n;
    int r;
     String s;
     public Calculator() {
        n = 2;
        r = 5;
        s = "+";
    }
     Calculator(String operation) {
        n = 3;
        r = 9;
        s = operation;

    }

     public int calculateCombinations(int n, int r, String s) {
        int result = 0;
        if (s == "+") {
            result = n + r;
        } else if (s == "-") {
            result = n - r;
        } else if (s == "*") {
            result = n * r;
        } else if (s == "/") {
            result = n / r;
        }
        return result;
    }
}
class CalculatorExample{
    public static void main (String [] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator);
        System.out.println(myCalculator.calculateCombinations(3, 4, "*"));
    }
}

class PercentCal extends Calculator {
      String s = "/";
      public static void main (String[] args) {
          PercentCal myCal = new PercentCal();

          System.out.println(myCal.calculateCombinations(400 , 100 , myCal.s));


      }

}