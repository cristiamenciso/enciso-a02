package exercise10;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cristiam Enciso
 *
 */
// make an item object to hold values of several common objects.
public class Item {
    private String price;
    private String quantity;

    // make construction method to be able to set values in object array
    public Item(String price, String quantity) {
        this.price = price;
        this.quantity = quantity;
    } // make a getPrice method to access price
    public String getPrice() {
        return price;
    } // make a getQuantity method to access quanitity
    public String getQuantity(){
        return quantity;
    }
}
