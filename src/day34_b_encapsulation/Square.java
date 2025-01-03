package day34_b_encapsulation;

public class Square {
    // instance variable

    private int side;

    //constructor
    public Square(int side) {
        setSide(side);

    }
    //write the info
    public void setSide(int side) {
       if (side > 0) {
           this.side = side;
       }
    }
    //instance getter method for side instance variable
    // read the info
    public int getSide() {

        return side;
    }

    //instance method - calculateArea
    public int calculateArea() {
        int result = side * side;
        return result;
    }
    // instance method calculatePerimeter
    public int calculatePerimeter() {
        return side * 4;
        //or return side + side + side +side;

    }

    public String toString() {
        String message = "";
        message = "info about the square: " + "\n\t side: " + side+
                "\n\tArea: "+ calculateArea()+
                "\n\tPerimeter: "+ calculatePerimeter();
        return message;
    }

}
