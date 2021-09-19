package exercise10;
/*
        *  UCF COP3330 Fall 2021 Assignment 2 Solution
        *  Copyright 2021 Cristiam Enciso

*/
import java.util.Scanner;

public class Checkout {
    final double taxRate = 5.5;
    // make an array of item objects
    Item[] itemArray = new Item[3];
    // Make method to get and store input into item array
    void getInput() {
        Scanner in = new Scanner(System.in);
        // Loop to pass through the object array using the construction method to hold variables
        for(int i = 0; i < 3; i++){
            System.out.printf("Enter the price of item %d: %n", (i + 1));
            String answer1 = in.nextLine();
            System.out.printf("Enter quantity of item %d: %n", (i + 1));
            String answer2 = in.nextLine();
            itemArray[i] = new Item(answer1, answer2);
        }

    } // Make method to add up the total while also parsing string into doubles
    public double subTotal() {
        double subTotal = 0.0;
        for(int i = 0; i < 3; i++) {
            subTotal += Double.parseDouble(itemArray[i].getPrice()) * Double.parseDouble(itemArray[i].getQuantity());
        }

        return subTotal;

    } // Method to calculate the tax and the final amount
    public double totalWithTax(double subTotal) {
        double tax = subTotal * (taxRate / 100.0);
        double totalTax = subTotal + tax;
        return totalTax;
    }
    // method to print out results
    public void printOutput(double subTotal, double totalWithTax) {
        System.out.printf("subtotal: $%.2f%n", subTotal);
        System.out.printf("Tax: $%.2f%n", subTotal * (taxRate / 100.0));
        System.out.printf("Total: $%.2f%n", totalWithTax);
    }




}
