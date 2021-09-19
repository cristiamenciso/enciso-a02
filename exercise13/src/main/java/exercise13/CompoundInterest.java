package exercise13;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 * */

import java.util.Scanner;

public class CompoundInterest {
    private double principal;
    private double rate;
    private double years;
    private double compound;

    // make get and set methods for variable access
    public void setPrincipal(double principal) {
        this.principal = principal;
    }
    public double getPrincipal() {
        return principal;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getRate() {
        return rate;
    }
    public void setYears(double years) {
        this.years = years;
    }
    public double getYears() {
        return years;
    }
    public void setCompound(double compound) {
        this.compound = compound;
    }
    public double getCompound(){
        return compound;
    }
    // Get and set Output using set methods
    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        setPrincipal(in.nextDouble());
        System.out.println("enter the rate of interest in percentage form: ");
        setRate(in.nextDouble());
        System.out.println("Enter the amount of years: ");
        setYears(in.nextDouble());
        System.out.println("What is the number of times the interest is compounded? ");
        setCompound(in.nextDouble());
    } // Make a method to print out the results
    public void printOutput(){
        double interest = getPrincipal() * Math.pow((1 + (rate / 100) / getCompound()), getCompound() * getYears());
        System.out.printf("$%.0f invested at %.1f%% for %d years compounded %d times per year is $%.2f.", getPrincipal(), getRate(), (int)getYears(), (int)getCompound(), interest);
    }
}
