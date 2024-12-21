package day30_b_custom_classes;

import java.util.ArrayList;
import java.util.Scanner;

//i will use this class as a runner class (with main method)
public class AllPeople {
    public static void main(String[] args) {

        //this is local variable
        //It is inside Method
        String name2 ;

        //cant use it directly b/c it doesnt have initial value
        //System.out.println(name);
        //System.out.println(name);

        //sample object creation we have seen so far


        //reference side               object side
        Scanner key =                 new Scanner(System.in);
        String str =                  new String("hello");
        ArrayList <String> list =     new ArrayList<>();
        String [] strArr =            new String[5];


        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person5 = new Person();
        Person person6 = new Person();
        Person person7 = new Person();

        //how can i access to those instances variables
        // need to create the object to access them


        person1. name = "Tom";
        person1.age = 30;
        person1.height = 6.1;
        person1.isMarried = true;
        System.out.println();
        System.out.println("person1 info: ");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);

        person2.name= "winnie";
        person2.age = 30;
        person2.height= 6.5;
        person2.isMarried = false;
        System.out.println();
        System.out.println("person2 info: ");

        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);

        System.out.println();
        System.out.println("person3 info: ");

        System.out.println(person3.name);
        System.out.println(person3.age);
        System.out.println(person3.height);
        System.out.println(person3.isMarried);



    }

}
