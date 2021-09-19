package base;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */


import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        // make a Scanner object
        Scanner in = new Scanner(System.in);
        // initiate class object
        LegalAge legal = new LegalAge();
        // Prompt user for input
        System.out.println("What is your age");
        legal.setAge(in.nextInt());
        // Output results
        legal.printOutput();

    }


}
