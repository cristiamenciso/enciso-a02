package exercise17;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */


public class Solution17 {
    public static void main(String[] args) {
        // make an class object instant
        BloodAlcoholCalc calc = new BloodAlcoholCalc();
        // prompt user for input
        calc.getInput();
        // Call calculate function
        String reading = calc.calculateLevel();
        calc.printOutput(reading);


        }


    }

