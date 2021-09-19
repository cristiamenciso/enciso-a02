package base;

import java.util.Scanner;

public class PaintShop {
    // make variables to hold values
    static final int PAINT = 350;
    private double length;
    private double width;
    private double area;
    private double gallons;

    // make get and set methods to assign values
    public void setLength(double length){
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    // make a set method to calculate area
    public void setArea(double length, double width) {
        this.area = length * width;
    }
    public double getArea(){
        return area;
    }
    // set method to calculate number of gallons
    public void setGallons(double area) {
        this.gallons = area / PAINT;
    }
    public double getGallons() {
        return gallons;
    }
    // make a method to prompt user for input
    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("What is the length? ");
        // set input with set methods
        setLength(in.nextDouble());
        System.out.println("What is the width? ");
        setWidth(in.nextDouble());

    }
    // make method print formatted output
    public void printOutput(){
        if(getArea() % PAINT != 0) {
            System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet", (int)Math.ceil(gallons),(int)area);
        }
        else {
            System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet", (int)gallons, (int)area);
        }
    }
}