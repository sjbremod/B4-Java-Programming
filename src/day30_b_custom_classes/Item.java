package day30_b_custom_classes;

public class Item {


    String name;
    double price;


        public String toString (){
            String message = "Item: "+ "\n\tItem name: "+name + "\n\tItem price: $"+price;
            return message;
        }
}
