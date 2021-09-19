package exercise14;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */


import java.util.Scanner;

public class TaxCalculator {
    // make variables to be manipulated later
    private String amount;
    private String state;
    final String currentState = "WI";
    // make get and set methods to be able to manipulate variables
    public void setAmount(String amount){
        this.amount = amount;
    }
    public String getAmount() {
        return amount;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    // Make a get output function to store the variables made by user
    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        setAmount(in.nextLine());
        System.out.print("What is the state? ");
        setState(in.nextLine());
    }

    // Make a method to calculate tax
    public double calculateTax(String amount){
        double tax = Double.parseDouble(amount) * (5.5 / 100.0);
        return tax;
    }
    // make a method to conditionally print out the output
    public void printOutput(double tax) {
        if(getState().equals(currentState)) {
            System.out.printf("The subtotal is $%.2f%nThe tax is $%.2f%nThe total is $%.2f", Double.parseDouble(getAmount()), tax, Double.parseDouble(getAmount()) + tax);
        }
        else {
            System.out.printf("The total is $%.2f", Double.parseDouble(getAmount()));
        }
    }



}
