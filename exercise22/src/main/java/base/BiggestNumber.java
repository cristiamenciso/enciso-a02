package base;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 */


import java.util.Scanner;

public class BiggestNumber {
    static final Scanner in = new Scanner(System.in);
    private int num1;
    private int num2;
    private int num3;

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum3(int num3) {
        this.num3 = num3;
    }
    public int getNum3() {
        return num3;
    }
    public void getInput() {
        System.out.print("Enter the first number: ");
        setNum1(in.nextInt());
        System.out.print("Enter the second number: ");
        setNum2(in.nextInt());
        System.out.print("Enter the third number: ");
        setNum3(in.nextInt());
    }
    public String getBiggestNumber() {
        String str = "the largest number is: ";
        if(getNum1() > getNum2() && getNum1() > getNum3()) {
            return str + getNum1() + ".";
        }
        else if(getNum2() > getNum3()) {
            return str + getNum2() + ".";
        }
        else {
            return str + getNum3() + ".";
        }

    }
    // make a print function to print out string results
    public void printOutput(String str) {
        System.out.print(str);
    }
}
