package base;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class BloodAlcoholCalc {
    private String gender;
    private String ounces;
    private String weight;
    private String timeLastDrink;

    // make get and set methods to have access to the class variables
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setOunces(String ounces) {
        this.ounces = ounces;
    }
    public String getOunces() {
        return ounces;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getWeight() {
        return weight;
    }
    public void setTimeLastDrink(String timeLastDrink){
        this.timeLastDrink = timeLastDrink;
    }
    public String getTimeLastDrink() {
        return timeLastDrink;
    }
    // make an input method to prompt user for input
    // Have to validate that input is numeric 
    public void getInput() {
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a 1 is you are male or a 2 if you are a female: ");
            setGender(in.nextLine());
            System.out.print("How many ounces of alcohol did you have  ");
            setOunces(in.nextLine());
            System.out.print("What is your weight, in pounds? ");
            setWeight(in.nextLine());
            System.out.print("How many hours has it been since your last drink? ");
            setTimeLastDrink(in.nextLine());
        } while(!isNumeric(getGender()) || !isNumeric(getOunces()) || !isNumeric(getWeight()) || !isNumeric(getTimeLastDrink()));
    }

    // Make a method to validate that input is numeric
    public boolean isNumeric(String str){
        // try and catch to find error
        try {
            Double.parseDouble(str);
            return true;
        }   catch(NumberFormatException e) {
            System.out.println("Please enter numeric values");
            return false;
        }
    } //  make a calculate level method to do all calculations
    public String calculateLevel() {
        // make local variables for method for easier reading
        double drinks = Double.parseDouble(getOunces());
        double pounds = Double.parseDouble(getWeight());
        double time = Double.parseDouble(getTimeLastDrink());
        String reading;

        if(getGender().equals("1")){
            double maleLevel = (drinks * 5.14 / pounds * 0.73)  - (.015 * time);
            System.out.printf("Your BAC is %f%n", maleLevel);
            reading = (maleLevel < 0.08) ? "It is legal for you drive" : "It is not legal for you to drive";
            return reading;
        }
        else if(getGender().equals("2")) {
            double femLevel = ((drinks * 5.14)/ (pounds * 0.66)) - (.015 * time);
            System.out.printf("Your BAC is %f%n", femLevel);
            reading = (femLevel < 0.08) ? "It is legal for you to drive" : "It is not legal for you to drive";
            return reading;
        }
       return "0";
    }
    public void printOutput(String reading) {
        System.out.print(reading);
    }

}
