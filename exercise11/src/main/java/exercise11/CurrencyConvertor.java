package exercise11;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
*/
import java.util.Scanner;

public class CurrencyConvertor {
    // make variables for euros, dollars and conversion rate
    private String euros;
    private double dollars;
    private String rate;

    // Make get and methods to access variables
    public void setEuros(String euros) {
        this.euros = euros;
    }

    public String getEuros(){
        return euros;
    }
    public void setDollars() {
        // set dollars to return calculated dollar amount.
        this.dollars = (Double.parseDouble(getRate())) * (Double.parseDouble(getEuros()));
    }
    public double getDollars() {
        return dollars;
    }
    public void setRate(String rate) {
        this.rate = rate;
    }
    public String getRate() {
        return rate;
    }
    // Make a method to takin in user input and store using set methods 
    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("How much money in Euros? ");
        setEuros(in.nextLine());
        System.out.println("What is the conversion rate? ");
        setRate(in.nextLine());
    }// Make a printOutput method to print out the results.

    public void printOutput() {
        String str1 = Integer.parseInt(getEuros()) + " euros at an exchange rate of " + Double.parseDouble(getRate()) + " is\n";
        // cal setDollars to calculate the amount of dollars in euros
        setDollars();
        System.out.printf("%s%.2f U.S dollars.", str1, getDollars());


    }
}
