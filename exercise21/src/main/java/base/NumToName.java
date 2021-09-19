package base;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class NumToName {
    static final Scanner in = new Scanner(System.in);
    private String month;

    // make get and set methods to manipulate the private variables

    public void setMonth(String month) {
        this.month = month;
    }
    public String getMonth() {
        return month;
    }
    // make a method to get input from the user
    public void getInput() {
        System.out.print("Please enter the number of the month? ");
        setMonth(in.nextLine());
    }
    // make a printOutput method that prints conditionally with switch statement
    public void printOutput() {
        switch (Integer.parseInt(getMonth())) {
            case 1 -> System.out.print("The name of the month is January");
            case 2 -> System.out.print("The name of the month is February");
            case 3 -> System.out.print("The name of the month is March");
            case 4 -> System.out.print("The name of the month is April");
            case 5 -> System.out.print("The name of the month is May");
            case 6 -> System.out.print("The name of the month is June");
            case 7 -> System.out.print("The name of the month is July");
            case 8 -> System.out.print("The name of the month is August");
            case 9 -> System.out.print("The name of the month is September");
            case 10 -> System.out.print("The name of the month is October");
            case 11 -> System.out.print("The name of the month is November");
            case 12 -> System.out.print("The name of the month is December");
            default -> System.out.print("Please enter a number between 1 and 12");
        }
    }
}
