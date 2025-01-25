package day33_a_static;

public class Iphone {

    //instance variable
    String model;
    double price;

    //static variables
    static String company;
    static String os;
    static String appleDay;

    //constructor


    public Iphone(String model, double price) {
        this.model = model;
        this.price = price;

    }
    //static block - static initialization
    static {
        System.out.println("static block run: ");
        company = "apple";
        os = "ios";
        appleDay = "november 30th";



    }
    //instance method

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}' +
                " -- " +
                ", company: "+ company +
                ", OS: "+ os +
                ", apple day: "+appleDay;
    }
}
