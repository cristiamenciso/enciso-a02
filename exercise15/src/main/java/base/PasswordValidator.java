package base;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class PasswordValidator {
    // make variables needed
    static final String TRUEPASSWORD = "abc$123";
    private String passwordAttempt;

    // Make get and set method to access the password attempt
    public void setPasswordAttempt(String password){
        this.passwordAttempt = password;
    }
    public String getPasswordAttempt() {
        return passwordAttempt;
    }
    // Make an input method to collect and set variable
    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("What is the password? ");
        setPasswordAttempt(in.nextLine());
    }
    // Print conditional output
    public void printOutput() {
        // use if/else statement for condition
        if(!getPasswordAttempt().equals(TRUEPASSWORD)) {
            System.out.println("I don't know you.");
        }
        else {
            System.out.println("Welcome!");
        }
    }
}
