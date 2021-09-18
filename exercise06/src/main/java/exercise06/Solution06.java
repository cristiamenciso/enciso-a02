/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 *
 Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.
Constraints
Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.
Challenge
Handle situations where the program returns a negative number by stating that the user can already retire.
 
 */


package exercise06;
import java.util.Scanner;
import java.util.Calendar;

    public class Solution06 {
        public static void main(String[] args) {
            // Inititate scanner objects
            Scanner in = new Scanner(System.in);
            // Prompt users for input
            System.out.print("What is your current age? ");
            // Store value in string variables
            String age = in.nextLine();
            System.out.print("At what age would you like to retire? ");
            String ageRetire = in.nextLine();
            // Initiate calculator object
            RetirementCalculator calc = new RetirementCalculator();
            // Call retirement function
            int ageOfRetirement = calc.calculateRetirementAge(age, ageRetire);
            int timeRemaining = calc.retirementYear(ageOfRetirement);
            // print out the results
            calc.printOutput(ageOfRetirement, timeRemaining);
        }
    }



