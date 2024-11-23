package day12_switch_statements;

import java.util.Scanner;

public class ArmyQualification {
    public static void main(String[] args) {
        boolean iscCitizenship;
        boolean isResident;
        boolean hasDiploma;
        int age;
        Scanner key = new Scanner(System.in);

        System.out.println("Welcome to Army Station");
        System.out.println("Please, answer the following question to check eligibility\n");
        System.out.print("\tare you citizen(true/false): ");
        iscCitizenship = key.nextBoolean();
        System.out.print("\tare you a resident(true/false: ");
        isResident = key.nextBoolean();
        System.out.print("\tDo you have a high school dipoloma (true/false): ");
        hasDiploma = key.nextBoolean();
        System.out.print("\t how old are you: ");
        age = key.nextInt();

        System.out.println();
        System.out.println(iscCitizenship);
        System.out.println(isResident);
        System.out.println(hasDiploma);
        System.out.println(age);

        if((iscCitizenship || isResident ) && (age >=18 && age <=35)&& hasDiploma ){
            System.out.println("you are eligible");

        }else {
            if(!iscCitizenship || !isResident){
                System.out.println("you need to be a citizen or resident ");
            }
            if (!hasDiploma){
                System.out.println("must have hs diploma");
            }
            if (age < 18 || age > 35){//or do !(age >=18 && age <=35)
                System.out.println("your age must be between 18-35 old");

            }

        }


    }
}
