package base;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 *
 */


public class Solution14 {
    public static void main(String[] args) {
        TaxCalculator tax = new TaxCalculator();
        // Prompt user for input using input method
        tax.getInput();
        // calculate tax
        double salesTax = tax.calculateTax(tax.getAmount());
        // Print Output
        tax.printOutput(salesTax);


    }
}
