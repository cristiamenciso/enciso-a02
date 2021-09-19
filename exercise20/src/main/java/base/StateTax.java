package base;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */


import java.util.Scanner;

public class StateTax {
    // Make final variables that are constant
    static final Scanner in = new Scanner(System.in);
    static final String WIS = "Wisconsin";
    static final String IL = "Illinois";
    static final String CNTY1 = "Dunn";
    static final String CNTY2 = "Eau Claire";
    // Make private variables to manipulate
    private String orderAmount;
    private double adjustedAmount;
    private String state;
    private String county;

    // make get and set method for private variables
    public void setOrderAmount(String amount) {
        this.orderAmount = amount;
    }
    public String getOrderAmount(){
        return orderAmount;
    }
    public void setAdjustedAmount(double amount) {
        this.adjustedAmount = amount;
    }
    public double getAdjustedAmount() {
        return adjustedAmount;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setCounty(String county) {
        this.county = county;
    }
    public String getCounty() {
        return county;
    }

    // make an input method to prompt user for input and store ir in the class variables
    public void getInput() {
        System.out.print("What is the order amount? ");
        setOrderAmount(in.nextLine());
        System.out.print("What state do you live in? ");
        setState(in.nextLine());
        if(getState().equals(WIS)) {
            System.out.print("What county do you live in? ");
            setCounty(in.nextLine());
            if(getCounty().equals(CNTY1)) {
                setAdjustedAmount((Double.parseDouble(getOrderAmount()) * .05) + Double.parseDouble(getOrderAmount()));
            }
            // Call print function from within if statements to get output conditionally.
            else if(getCounty().equals(CNTY2)) {
                setAdjustedAmount((Double.parseDouble(getOrderAmount()) * .04) + Double.parseDouble(getOrderAmount()));
            }
            String str = String.format("The tax is $%.2f%nThe total is $%.2f", (getAdjustedAmount() - Double.parseDouble(getOrderAmount())), getAdjustedAmount());
            printOutput(str);
        }
        else if(getState().equals(IL)) {
            setAdjustedAmount((Double.parseDouble(getOrderAmount()) * .08) + Double.parseDouble(getOrderAmount()));
            String str = String.format("The tax is $%.2f%nThe total is $%.2f", getAdjustedAmount() - Double.parseDouble(getOrderAmount()), getAdjustedAmount());
            printOutput(str);
        }
        else {
            String str = String.format("The total is $%.2f", Double.parseDouble(getOrderAmount()));
            printOutput(str);
        }

    }
    // ,make a print output method to print out the resulting string
    public void printOutput(String str) {
        System.out.print(str);
    }
}

