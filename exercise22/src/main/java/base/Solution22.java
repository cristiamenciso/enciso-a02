package base;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */

public class Solution22 {
    public static void main(String[] args) {
        BiggestNumber number = new BiggestNumber();
        // prompt user for input
        number.getInput();
        // call method to get biggest number
        // Print using print method to display results
        number.printOutput(number.getBiggestNumber());
    }
}
