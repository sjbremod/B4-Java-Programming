package day32_custom_classes;

public class Store {
    public static void main(String[] args) {

    Food food1 = new Food("apple");
        System.out.println(food1);
    Food food2 = new Food("orange",5);
        System.out.println(food2);
    Food food3 = new Food("banana",2,3.99);
        System.out.println(food3);
    }
}
