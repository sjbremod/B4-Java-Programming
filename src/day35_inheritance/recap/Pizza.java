package day35_inheritance.recap;

public class Pizza {

    //instance variables
   private   String size;
   private  int numberOfToppings;


    public Pizza(String size, int numberOfToppings){
        //this.size = size;
        setSize(size);
        //this.numberOfToppings = numberOfToppings;
        setNumberOfToppings(numberOfToppings);



    }

    public void setSize(String size) {
        if(size.equalsIgnoreCase("small")
        || size.equalsIgnoreCase("medium")
        || size.equalsIgnoreCase("large")){

            this.size = size;
        }

    }

    public void setNumberOfToppings(int numberOfToppings) {
        if(numberOfToppings > 0){
            this.numberOfToppings = numberOfToppings;
        }

    }

    //instance method
    public double calculatePrice(){

        double toppingPrice = 0;
        if(size.equalsIgnoreCase("small")){
            toppingPrice = 4;
        } else if (size.equalsIgnoreCase("medium")){
            toppingPrice= 6;
        } else if (size.equalsIgnoreCase("large")){
            toppingPrice = 8;

        }
        toppingPrice += numberOfToppings * .75;
        return toppingPrice;
    }

    //special method toString which helps print
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfToppings=" + numberOfToppings +
                "totalPrice=" + calculatePrice() +
                '}';
    }

}

