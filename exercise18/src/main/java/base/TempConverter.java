package base;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */


import java.util.Scanner;

public class TempConverter {
    static final Scanner in = new Scanner(System.in);
    static final String FLAGUPPER = "F";
    static final  String FLAGLOWER = "f";
    private String unit;
    private String temp;

    // make get and set methods
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getUnit() {
        return unit;
    }
    public void setTemp(String temp) {
        this.temp = temp;
    }
    public String getTemp() {
        return temp;
    }
    // Get input that gets users input conditionally 
    public void getInput() {

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        setUnit(in.nextLine());
        if(!getUnit().equals(FLAGUPPER) || !getUnit().equals(FLAGLOWER)) {
            System.out.print("Please enter the temperature in fahrenheit ");
            setTemp(in.nextLine());
            // Call calculateFToC method from within printString method
            printString(calculateFToC());
        }
        else {
            System.out.print("Please enter the temperature in Celsius ");
            setTemp(in.nextLine());
            // Call calculateCToF method and print out
            printString(calculateCToF());
        }

    } // make calculate functions that return strings
    public String calculateFToC() {
        return "The temperature in Celsius is " + (int)((Integer.parseInt(getTemp()) - 32) * (5.0 / 9.0));
    }
    public String calculateCToF()  {
        return "The temperature in Fahrenheit is " + (int)((Integer.parseInt(getTemp()) * 9.0 / 5.0) + 32) + ".";

    }
    public void printString(String str) {
        System.out.print(str);
    }

}
