package base;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */


public class Solution19 {
    public static void main(String[] args) {
        BMICalculator calc = new BMICalculator();
        // get input from user and store in variables
        calc.getInput();
        // Calculate bmi
        calc.setBMI(calc.getHeight(), calc.getWeight());
        // print conditional output
        calc.printResults();
    }
}
