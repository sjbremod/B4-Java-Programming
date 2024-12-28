package day32_custom_classes;

public class Company {
    public static void main(String[] args) {

    Employee emp1 = new Employee("Tom","SDET");
        System.out.println(emp1);
    Employee emp2 = new Employee("jerry",120_000,107,"QA");
        System.out.println(emp2);

        System.out.println();
        emp1.goToMeeting();
        emp2.goToMeeting();






    }
}
