package day31_custom_classes;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    double totalPrice;
    boolean isPersian;

    // create constructor that initializes these instance variables

    public Carpet(double inputWidth,double inputLength,double inputUnitPrice, boolean inputIsPersian){
        width=inputWidth;
        length= inputLength;
        unitPrice=inputUnitPrice;
        isPersian=inputIsPersian;
        calculateTotalPrice();
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                ", isPersian=" + isPersian +
                '}';
    }
    public void calculateTotalPrice(){
        totalPrice = width*length*unitPrice;
        if (isPersian){
            totalPrice += 200;
        }
    }
}
