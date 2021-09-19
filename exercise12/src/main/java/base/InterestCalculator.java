package base;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */

public class InterestCalculator {
    private double principal;
    private double interestRate;
    private int years;

    // make a constructor method to set the private variables
    public InterestCalculator(double principal, double interestRate, int years) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.years = years;
    }
    // make get methods to access variables
    public double getPrincipal() {
        return principal;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public int getYears() {
        return years;
    }
    public void printOutput(){
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%d.", getYears(), getInterestRate(), Math.round(getPrincipal() * (1 + (getInterestRate() / 100) * getYears())));
    }
}
