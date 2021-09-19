package base;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 *
 * Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.
 */

public class Solution09 {
    public static void main(String[] args) {
        //make a paint shop object to call methods
        PaintShop shop = new PaintShop();
        // prompt users for input via input function
        shop.getInput();
        // calculate amount of paint needed
        shop.setArea(shop.getLength(), shop.getWidth());
        // Calculate gallons needed
        shop.setGallons(shop.getArea());
        // print output
        shop.printOutput();

    }
}
