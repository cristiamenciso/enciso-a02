package base;
import java.util.Calendar;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */

public class RetirementCalculator {
    // make a calendar object
    Calendar cal = Calendar.getInstance();
    // make a calculate method that takes in current age and retirement age
    public int calculateRetirementAge(String age, String retireAge){
        // convert string variables to integers before calculations.
        // return the amount of time left until retirement
        return (Integer.parseInt(retireAge) - Integer.parseInt(age));
    }
    // method to get the year of retirement
    public int retirementYear(int timeLeft){

        // return timeleft + current year
        return (cal.get(Calendar.YEAR) + timeLeft);
    }
    // make a method to print the final output
    public void printOutput(int age, int time){
        // print output
        System.out.println("You have " + age + " years left until you can retire.");
        System.out.println("it's " + cal.get(Calendar.YEAR) + "," + " so you can retire in " +  time + ".");
    }
}



