package com.homework6;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumInRange(10, 30));
        System.out.println(checkSumInRange(2, 11));
        checkSign(10);
        checkSign(-3);
        System.out.println(checkSignInversedBoolean(10));
        System.out.println(checkSignInversedBoolean(-10));
        printStringRepeater("Hello World!", 8);

        System.out.println(leapYearCheck(200));
        System.out.println(leapYearCheck(1200));
        System.out.println(leapYearCheck(400));
        System.out.println(leapYearCheck(2044));
        System.out.println(leapYearCheck(5));
        System.out.println(leapYearCheck(600));

    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign() {
        int a = 4;
        int b = 10;
        String answer = ((a + b) >= 0) ? "Sum is equal or more than 0.\n" : "Sum is less than 0.\n";

        System.out.println(answer);
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Red\n");
        } else if (0 < value && value <= 100) {
            System.out.println("Yellow\n");
        } else {
            System.out.println("Green\n");
        }

    }

    public static void compareNumbers() {
        int a = 4;
        int b = 10;
        String answer = (a >= b) ? "A is equal or more than B.\n" : "A is less than B.\n";

        System.out.println(answer);
    }

    public static boolean checkSumInRange(int a, int b) {
        if (10 <= (a + b) && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkSign(int num) {
        String answer = (num >= 0) ? "Number is equal or more than 0.\n" : "Number is less than 0.\n";

        System.out.println(answer);
    }

    public static boolean checkSignInversedBoolean(int num) {
        return (num < 0);
    }

    public static void printStringRepeater(String stringToPrint, int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(stringToPrint);
        }
    }

    public static boolean leapYearCheck(int year) {
        if ((year % 400) == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
