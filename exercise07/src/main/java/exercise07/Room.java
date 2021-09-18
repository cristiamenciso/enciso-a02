package exercise07;

public class Room {
    // make variables for length, width, area, conversion in square meters, abd conversion factor
    private int length;
    private int width;
    private int area;
    final double factor = 0.09290304;
    private double conversion;


    // Method to print out entire output
    // make use of the get functions to separate calculations
    public void printOutput() {
        System.out.println("you entered dimensions of " + getLength() + " feet by " + getWidth() + " feet.");
        System.out.println("The area is\n" + getArea() + " square feet");
        System.out.printf("%.3f square meters", getConversion());
        System.out.print("\nThe formula for this conversion is m2 = f2 x " + factor);
    }
    // make get and set methods for the class instance variables
    public void setConversion(int area){
        this.conversion = (area * factor);
    }
    public double getConversion(){
        return conversion;
    }

    public void setLength(int length){
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
    public void setArea(int length, int width){
        this.area = length * width;
    }
    public int getArea(){
        return area;
    }
}
