package base;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class BMICalculator {
    static final Scanner in = new Scanner(System.in);
    private double height;
    private double weight;
    private double bmi;

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setBMI(double height, double weight) {
        this.bmi = (weight / (height * height)) * 703;
    }
    public double getBMI() {
        return bmi;
    }
    // make an input method to prompt user while validating numeric input
    public void getInput() {
        System.out.print("What is your height in inches? ");
        // prompt again if input is not numeric
        while(!in.hasNextDouble()) {
            System.out.print("What is your height in inches? ");
        }
        setHeight(in.nextDouble());
        System.out.print("What is your weight in pounds? ");
        while(!in.hasNextDouble()) {
            in.next();
            System.out.print("What is your weight in pounds? ");
        }
        setWeight(in.nextDouble());

    }



    // make methos to print out results on condition of bmi level
    public void printResults() {
        System.out.printf("Your BMI is %.1f%n", getBMI());
        // make if / else statements to go through conditions
        if(getBMI() < 18.5) {
            System.out.println("You are underweight. You should see a doctor");
        }
        else if((getBMI() >= 18.5) && (getBMI() <= 25)) {
            System.out.println("You are withing the ideal weight range.");
        }
        else {
            System.out.println("You are overweight. You should see a doctor.");
        }
    }
}
