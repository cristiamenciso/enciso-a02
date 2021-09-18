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



