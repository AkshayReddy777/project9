//package com.company;
//
//public class BracketCombination {
//
//    static int bracketCombinationCount(int userInput) {
//// the formula for the n th combination for the series is (2*n)!/((n+1)!*n!)
//        int numerator = 1;
//        int denominatorFirstPart = 1;
//        int denominatorSecondPart = 1;
//        int bracketCombinations = 1;
//        for (int i = 2 * userInput; i >= 1; i--) {
//
//            numerator *= i;
//        }
//        for (int i = (userInput + 1); i >= 1; i--) {
//
//            denominatorFirstPart *= i;
//        }
//        for (int i = (userInput); i >= 1; i--) {
//
//            denominatorSecondPart *= i;
//        }
//        bracketCombinations = (numerator) / (denominatorFirstPart * denominatorSecondPart);
//
//        return bracketCombinations;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(bracketCombinationCount(7));
//    }
//
//}
//
//
////public class BracketCombination {
////    static void _printParenthesis(char str[], int pos, int n, int open, int close)
////    {
////        if(close == n)
////        {
////            // print the possible combinations
////            for(int i=0;i<str.length;i++)
////                System.out.print(str[i]);
////            System.out.println();
////            return;
////        }
////        else
////        {
////            if(open > close) {
////                str[pos] = ')';
////                _printParenthesis(str, pos+1, n, open, close+1);
////            }
////            if(open < n) {
////                str[pos] = '(';
////                _printParenthesis(str, pos+1, n, open+1, close);
////            }
////        }
////    }
//
//    // Wrapper over _printParenthesis()
//    static void printParenthesis(char str[], int n)
//    {
//        if(n > 0)
//            _printParenthesis(str, 0, n, 0, 0);
//        return;
//    }
//
//    // driver program
//    public static void main (String[] args)
//    {
//        int n = 3;
//        char[] str = new char[2 * n];
//        printParenthesis(str, n);
//    }
//}
//
//// import java.util.ArrayList;
////
////public class BracketCombination {
////
////    public static ArrayList<String> twoBracketPairs = new ArrayList<>();
////    public static ArrayList<String> threeBracketPairs = new ArrayList<>();
////    public static ArrayList<String> fourBracketPairs = new ArrayList<>();
////    public static ArrayList<String> fiveBracketPairs = new ArrayList<>();
////
////
////    public static void init() {
////        twoBracketPairs.add("()()");
////        twoBracketPairs.add("(())");
////
////        threeBracketPairs.add("()()()");
////        threeBracketPairs.add("()(())");
////        threeBracketPairs.add("(())()");
////        threeBracketPairs.add("(()())");
////        threeBracketPairs.add("((()))");
////
////        fourBracketPairs.add("()()()()");
////        fourBracketPairs.add("()()(())");
////        fourBracketPairs.add("()(())()");
////        fourBracketPairs.add("()(()())");
////        fourBracketPairs.add("()((()))");
////        fourBracketPairs.add("(())()()");
////        fourBracketPairs.add("(())(())");
////        fourBracketPairs.add("(()())()");
////        fourBracketPairs.add("(()()())");
////        fourBracketPairs.add("(()(()))");
////        fourBracketPairs.add("((()))()");
////        fourBracketPairs.add("((())())");
////        fourBracketPairs.add("((()()))");
////        fourBracketPairs.add("(((())))");
////
////        fiveBracketPairs.add("()()()()()");
////        fiveBracketPairs.add("()()()(())");
////        fiveBracketPairs.add("()()(())()");
////        fiveBracketPairs.add("()()(()())");
////        fiveBracketPairs.add("()()((()))");
////        fiveBracketPairs.add("()(())()()");
////        fiveBracketPairs.add("()(())(())");
////        fiveBracketPairs.add("()(()())()");
////        fiveBracketPairs.add("()(()()())");
////        fiveBracketPairs.add("()(()(()))");
////        fiveBracketPairs.add("()((()))()");
////        fiveBracketPairs.add("()((())())");
////        fiveBracketPairs.add("()((()()))");
////        fiveBracketPairs.add("()(((())))");
////        fiveBracketPairs.add("(())()()()");
////        fiveBracketPairs.add("(())()(())");
////        fiveBracketPairs.add("(())(())()");
////        fiveBracketPairs.add("(())(()())");
////        fiveBracketPairs.add("(())((()))");
////        fiveBracketPairs.add("(()())()()");
////        fiveBracketPairs.add("(()())(())");
////        fiveBracketPairs.add("(()()())()");
////        fiveBracketPairs.add("(()()()())");
////        fiveBracketPairs.add("(()()(()))");
////        fiveBracketPairs.add("(()(()))()");
////        fiveBracketPairs.add("(()(())())");
////        fiveBracketPairs.add("(()(()()))");
////        fiveBracketPairs.add("(()((())))");
////        fiveBracketPairs.add("((()))()()");
////        fiveBracketPairs.add("((()))(())");
////        fiveBracketPairs.add("((())())()");
////        fiveBracketPairs.add("((())()())");
////        fiveBracketPairs.add("((())(()))");
////        fiveBracketPairs.add("((()()))()");
////        fiveBracketPairs.add("((()())())");
////        fiveBracketPairs.add("((()()()))");
////        fiveBracketPairs.add("((()(())))");
////        fiveBracketPairs.add("(((())))()");
////        fiveBracketPairs.add("(((()))())");
////        fiveBracketPairs.add("(((())()))");
////        fiveBracketPairs.add("(((()())))");
////        fiveBracketPairs.add("((((()))))");
////
////    }
////
////    public static void main(String[] args) {
////        init();
////        testBracketGeneration(6);
////    }
////
////    public static void testBracketGeneration(int number) {
////        if (number < 1) {
////            System.out.println("Can't generate combinations for value " + number);
////            return;
////        }
////        generateCombinations(number); // [1,3], [2,2], [3.1]
////        if (number > 3) {
////            generateCombinationsWithOpenBracket(number - 1); // ( all 3 brackets )
////        }
////    }
////
////    public static void generateCombinations(int number) {
////        if (number == 1) {
////            System.out.println("()");
////            return;
////        } else if (number == 2) {
////            System.out.print(twoBracketPairs.get(0) + ", ");
////            System.out.print(twoBracketPairs.get(1));
////            return;
////        } else if (number == 3) {
////            System.out.print(threeBracketPairs.get(0) + ", ");
////            System.out.print(threeBracketPairs.get(1) + ", ");
////            System.out.print(threeBracketPairs.get(2) + ", ");
////            System.out.print(threeBracketPairs.get(3) + ", ");
////            System.out.print(threeBracketPairs.get(4));
////            return;
////        } else if (number == 4) {
////            System.out.print(fourBracketPairs.get(0) + ", ");
////            System.out.print(fourBracketPairs.get(1) + ", ");
////            System.out.print(fourBracketPairs.get(2) + ", ");
////            System.out.print(fourBracketPairs.get(3) + ", ");
////            System.out.print(fourBracketPairs.get(4) + ", ");
////            System.out.print(fourBracketPairs.get(5) + ", ");
////            System.out.print(fourBracketPairs.get(6) + ", ");
////            System.out.print(fourBracketPairs.get(7) + ", ");
////            System.out.print(fourBracketPairs.get(8) + ", ");
////            System.out.print(fourBracketPairs.get(9) + ", ");
////            System.out.print(fourBracketPairs.get(10) + ", ");
////            System.out.print(fourBracketPairs.get(11) + ", ");
////            System.out.print(fourBracketPairs.get(12) + ", ");
////            System.out.print(fourBracketPairs.get(13) + ", ");
////
////
////        } else if (number == 5) {
////            System.out.print(fiveBracketPairs.get(0) + ", " );
////            System.out.print(fiveBracketPairs.get(1) + ", ");
////            System.out.print(fiveBracketPairs.get(2) + ", ");
////            System.out.print(fiveBracketPairs.get(3) + ", ");
////            System.out.print(fiveBracketPairs.get(4) + ", ");
////            System.out.print(fiveBracketPairs.get(5) + ", ");
////            System.out.print(fiveBracketPairs.get(6) + ", ");
////            System.out.print(fiveBracketPairs.get(7) + ", ");
////            System.out.print(fiveBracketPairs.get(8) + ", ");
////            System.out.print(fiveBracketPairs.get(9) + ", ");
////            System.out.print(fiveBracketPairs.get(10) + ", ");
////            System.out.print(fiveBracketPairs.get(11) + ", ");
////            System.out.print(fiveBracketPairs.get(12) + ", ");
////            System.out.print(fiveBracketPairs.get(13) + ", ");
////            System.out.print(fiveBracketPairs.get(14) + ", ");
////            System.out.print(fiveBracketPairs.get(15) + ", ");
////            System.out.print(fiveBracketPairs.get(16) + ", ");
////            System.out.print(fiveBracketPairs.get(17) + ", ");
////            System.out.print(fiveBracketPairs.get(18) + ", ");
////            System.out.print(fiveBracketPairs.get(19) + ", ");
////            System.out.print(fiveBracketPairs.get(20) + ", ");
////            System.out.print(fiveBracketPairs.get(21) + ", ");
////            System.out.print(fiveBracketPairs.get(22) + ", ");
////            System.out.print(fiveBracketPairs.get(23) + ", ");
////            System.out.print(fiveBracketPairs.get(24) + ", ");
////            System.out.print(fiveBracketPairs.get(25) + ", ");
////            System.out.print(fiveBracketPairs.get(26) + ", ");
////            System.out.print(fiveBracketPairs.get(27) + ", ");
////            System.out.print(fiveBracketPairs.get(28) + ", ");
////            System.out.print(fiveBracketPairs.get(29) + ", ");
////            System.out.print(fiveBracketPairs.get(30) + ", ");
////            System.out.print(fiveBracketPairs.get(31) + ", ");
////            System.out.print(fiveBracketPairs.get(32) + ", ");
////            System.out.print(fiveBracketPairs.get(33) + ", ");
////            System.out.print(fiveBracketPairs.get(34) + ", ");
////            System.out.print(fiveBracketPairs.get(35) + ", ");
////            System.out.print(fiveBracketPairs.get(36) + ", ");
////            System.out.print(fiveBracketPairs.get(37) + ", ");
////            System.out.print(fiveBracketPairs.get(38) + ", ");
////            System.out.print(fiveBracketPairs.get(39) + ", ");
////            System.out.print(fiveBracketPairs.get(40) + ", ");
////            System.out.print(fiveBracketPairs.get(41) + ", ");
////
////        }
////
////        for (int i = 1; i < number; i++) {
////            generateCombinations(i, number - i);
////        }
////    }
////
////    public static void generateCombinations(int first, int second) {
////        System.out.println("Now processing for : " + first + " , " + second + " combination.");
////
////        if (first == 1 && second == 2) {
////            System.out.print("()" + twoBracketPairs.get(0) + ", ");
////            System.out.print("()" + twoBracketPairs.get(1) + ", ");
////            return;
////        } else if (first == 2 && second == 1) {
////            System.out.print(twoBracketPairs.get(0) + "(), ");
////            System.out.print(twoBracketPairs.get(1) + "(), ");
////            return;
////        } else if (second == 0) {
////            return;
////        } else if (false) {
////            // 1 and 3
////            if (first == 1 && second == 3) {
////                for (int i = 0; i < threeBracketPairs.size(); i++) {
////                    System.out.print("()" + threeBracketPairs.get(i) + ", ");
////                }
////            } else if (first == 3 && second == 1) {
////                for (int i = 0; i < threeBracketPairs.size(); i++) {
////                    System.out.print(threeBracketPairs.get(i) + "(), ");
////                }
////            } else if (first == 2 && second == 2) {
////                System.out.print(twoBracketPairs.get(0) + twoBracketPairs.get(0) + ", ");
////                System.out.print(twoBracketPairs.get(0) + twoBracketPairs.get(1) + ", ");
////                System.out.print(twoBracketPairs.get(1) + twoBracketPairs.get(1) + ", ");
////
////            }
////            System.out.println();
////            return;
////        } else if (false) {
////            if (first == 1 && second == 4) {
////                for (int i = 0; i < fourBracketPairs.size(); i++) {
////                    System.out.print("()" + fourBracketPairs.get(i) + ", ");
////                }
////
////            } else if (first == 4 && second == 1) {
////                for (int i = 0; i < fourBracketPairs.size(); i++) {
////                    System.out.print(fourBracketPairs.get(i) + "(), ");
////                }
////            } else if (first == 3 && second == 2) {
////                System.out.print(threeBracketPairs.get(0) + twoBracketPairs.get(0) + ", ");
////                System.out.print(threeBracketPairs.get(0) + twoBracketPairs.get(1) + ", ");
////                System.out.print(threeBracketPairs.get(1) + twoBracketPairs.get(1) + ", ");
////
////            } else if (first == 2 && second == 3) {
////                System.out.print(twoBracketPairs.get(0) + threeBracketPairs.get(0) + ", ");
////                System.out.print(twoBracketPairs.get(0) + threeBracketPairs.get(1) + ", ");
////                System.out.print(twoBracketPairs.get(1) + threeBracketPairs.get(1) + ", ");
////
////            }
////
////        } else {
////            if (first == 1 && second == 5) {
////                for (int i = 0; i < fiveBracketPairs.size(); i++) {
////                    System.out.print("()" + fiveBracketPairs.get(i) + ", ");
////                }
////            } else if (first == 5 && second == 1) {
////                for (int i = 0; i < fiveBracketPairs.size(); i++) {
////                    System.out.print(fiveBracketPairs.get(i) + "(), ");
////                }
////            } else if (first == 2 && second == 4) {
////                System.out.print(twoBracketPairs.get(0) + fourBracketPairs.get(0) + ", ");
////                System.out.print(twoBracketPairs.get(0) + fourBracketPairs.get(1) + ", ");
////                System.out.print(twoBracketPairs.get(1) + fourBracketPairs.get(1) + ", ");
////
////            } else if (first == 4 && second == 2) {
////                System.out.print(fourBracketPairs.get(0) + twoBracketPairs.get(0) + ", ");
////                System.out.print(fourBracketPairs.get(0) + twoBracketPairs.get(1) + ", ");
////                System.out.print(fourBracketPairs.get(1) + twoBracketPairs.get(1) + ", ");
////
////            } else if (first == 3 && second == 3) {
////                System.out.print(threeBracketPairs.get(0) + threeBracketPairs.get(0) + ", ");
////                System.out.print(threeBracketPairs.get(0) + threeBracketPairs.get(1) + ", ");
////                System.out.print(threeBracketPairs.get(1) + threeBracketPairs.get(1) + ", ");
////
////            }
////        }
////    }
////
////
////
////
////        public static void generateCombinationsWithOpenBracket ( int number) {
////            System.out.println("Now processing for : (" + number + ") combination.");
////            if (number < 1) {
////                return;
////            }
////            for (int i = 0; i < fiveBracketPairs.size(); i++) {
////                System.out.print("( ");
////                System.out.print(fiveBracketPairs.get(i));
////                System.out.print(" ), ");
////            }
////
////        }
////    }
////
////
