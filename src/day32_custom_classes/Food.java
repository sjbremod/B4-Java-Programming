package day32_custom_classes;

public class Food {

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food (String name){
        this.name=name;

    }
    public Food (String name, int quantity){
       this(name);
        // this.name=name;
        this.quantity= quantity;

    }
    public Food (String name,int quantity, double unitPrice){
        this(name, quantity);
//        this.name= name;
//        this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculateTotalPrice();
    }
    // instance method
    public void calculateTotalPrice(){
        totalPrice= quantity*unitPrice;
    }


    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
