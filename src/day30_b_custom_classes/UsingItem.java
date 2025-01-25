package day30_b_custom_classes;

public class UsingItem {
    public static void main(String[] args) {

        Item item1 = new Item();

        item1.name = "orange";
        item1.price = 2.99;

        System.out.println(item1);// will get memory location b/c no toString declared yet


        System.out.println(item1);// now it will work

    }
}
