package exercise08;

import java.util.Scanner;

public class PizzaParty {
    // make variables for the pizza party
    private int numPeople;
    private int numPizza;
    private int numSlices;


    // Make get and set methods to access the private variables.
    public void setNumPeople(int people) {
        this.numPeople = people;
    }
    public int getNumPeople() {
        return numPeople;
    }
    public void setNumPizza(int pizzas) {
        this.numPizza = pizzas;
    }
    public int getNumPizza() {
        return numPizza;
    }
    public void setNumSlices(int slices) {
        this.numSlices = slices;
    }
    public int getNumSlices() {
        return numSlices;
    } // method to get input and set via set methods.
    // If else statement to validate user input is a numeric value
    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("How many people? ");
        if(in.hasNextInt()) {
            setNumPeople(in.nextInt());
        }
        else {
            System.out.println("Please enter a numeric value. Please try again.");
            getInput();
        }
        System.out.println("How many pizzas do you have?");
        if(in.hasNextInt()) {
            setNumPizza(in.nextInt());
        }
        else {
            System.out.println("Please enter a numeric value. Please try again.");
            getInput();
        }
        System.out.println("How many slices per pizza?");
        if(in.hasNextInt()) {
            setNumSlices(in.nextInt());
        }
        else {
            System.out.println("Please enter a numeric value. Please try again.");
            getInput();
        }


    }
    // Make method to print output by calling get and set methods
    public void printOutput(){
        // print out the calculated output
        System.out.printf("%d people with %d pizzas (%d slices)%n",getNumPeople(), getNumPizza(),(getNumPeople() * getNumPizza()));
        System.out.printf("Each person gets %d pieces of pizza.%nThere are %d leftover pieces.%n",((getNumPeople() * getNumPizza()) / getNumPeople()),((getNumPeople() * getNumPizza()) % getNumPeople()));
    }
}
