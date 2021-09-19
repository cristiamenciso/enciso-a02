package base;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */


public class LegalAge {
    // make variables for the class
    private int age;
    // make get ans set methods to manipulate private variables
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    // make a method to create a condtional string to print out
    public void printOutput() {
        String result = (getAge() >= 16) ? "You are old enough to legally drive" : "You are not old enough to drive";
        System.out.println(result);
    }

}
