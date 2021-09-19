package base;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class CarTroubleShoot {
    // make variables to track the user input as well as contact strings
    static final Scanner in = new Scanner(System.in);
    static final String YES = "y";
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;
    private String answer6;

// make get and set methods for the answers
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }

    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer6(String answer6) {
        this.answer6 = answer6;
    }

    public String getAnswer6() {
        return answer6;
    }
    // make a method to collect input and provide loop to call print function
    public void getInput() {
        System.out.print("Is the car silent when you turn the key? ");
        setAnswer1(in.nextLine());
        if(getAnswer1().equals(YES)) {
            System.out.print("Are the battery terminals corroded? ");
            setAnswer2(in.nextLine());
            if(getAnswer2().equals(YES)){
                printString("Clean the terminals and try again");
            }
            else {
                printString("The battery may be damaged.\nReplace the cables and try again");
            }

        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            setAnswer3(in.nextLine());
            if(getAnswer3().equals(YES)) {
                printString("Replace the battery");
            }
            else {
                System.out.print("Does the car crank up but fail to start? ");
                setAnswer4(in.nextLine());
                if(getAnswer4().equals(YES)) {
                    printString("Check spark plug connections.");
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    setAnswer5(in.nextLine());
                    if(getAnswer5().equals(YES)){
                        System.out.print("Does your care have fuel injection? ");
                        setAnswer6(in.nextLine());
                        if(getAnswer6().equals(YES)){
                            printString("Get it in for service");
                        }
                        else{
                            printString("Check to insure the chock is opening and closing");
                        }
                    }
                    else {
                        printString("This should be impossible");
                    }
                }
            }

        }



    }
    // method to print out strings for the maintenance readings. 
    public void printString(String str) {
        System.out.println(str);
    }
}
