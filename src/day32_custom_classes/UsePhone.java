package day32_custom_classes;

public class UsePhone {
    public static void main(String[] args) {

//        Phone phone1 = new Phone();
        // instead of given initial values like below we can use constructor
//        phone1.name = "iphone 16 pro";
//        phone1.brand = "apple";
//        phone1.memory= 128;
//        phone1.version = 18.02;
//

        Phone phone1 = new Phone("iphone 16 pro","apple",128,18.2);

// if you try to print without the toString you will get memory location
    //    System.out.println(phone1);// day32_custom_classes.Phone@5f184fc6

        System.out.println(phone1);

        Phone phone2 = new Phone("iphone 12 mini");
        System.out.println(phone2);
        System.out.println();

        Phone phone3 = new Phone("Iphone 16 pro max","apple",512);
        System.out.println(phone3);

        System.out.println();
        Phone phone4 = new Phone("iphone 14 pro","apple",512,16.0);
        System.out.println(phone4);



    }
}
