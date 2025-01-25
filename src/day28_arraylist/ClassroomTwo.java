package day28_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {


    ArrayList <String> groupOne = new ArrayList<>();
    groupOne.add("zakhar");
    groupOne.add("Yuliia");
    groupOne.add("Artem");
    groupOne.add("Roma");
    groupOne.add("Lenka");
    groupOne.add("Adi");
    groupOne.add("Nilufar");
    System.out.println(groupOne);

    ArrayList <String> groupTwo =new ArrayList<>();
    groupTwo.add("Pavlo");
    groupTwo.add("Steven");
    groupTwo.add("Ketevan");
    groupTwo.add("Ayaz");
    groupTwo.add("Kanan");
    groupTwo.add("Sammy");
        System.out.println(groupTwo);

        System.out.println();
        System.out.println("first person in group one: "+ groupOne.get(0));
        System.out.println("first person in group one: "+ groupTwo.get(0));
        System.out.println();
        System.out.println("Last person in Group one: "+  groupOne.get(groupOne.size()-1));
        System.out.println("Last person in Group one: "+  groupTwo.get(groupTwo.size()-1));
        System.out.println();
        for (int i = 1; i <groupOne.size() ; i++) {
            System.out.println("group one student "+(i+1)+ ": " + groupOne.get(i));
        }
        System.out.println();
        int count =1;
        for (String eachStudentName: groupTwo){
            System.out.println("group Two student "+ count++ + ": " + eachStudentName);
        }



    }
}

