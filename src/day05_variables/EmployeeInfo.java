package day05_variables;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.ToDoubleBiFunction;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName, lastName, companyName, jobTitle;
        int age, numOfPto;
        char gender, suite; // m/f
        boolean isFullTime, isMarried;
        double salary;


        firstName = "tom";
        lastName = "Jerry";
        companyName = "Loopcamp";
        jobTitle = "SDET";
        age = 30;
        numOfPto = 21;
        salary = 120_000.00; // cant use comma so use underscore
        isFullTime = true;
        isMarried = false;
        gender = 'M';
        suite = 'A';
        String fullReport = "Full Report:  \n\tFirst Name:\t\t " +firstName+ "\n\tLast Name:\t\t "+ lastName + "\n\tCompany name:\t " + companyName + "\n\tjob tilte:\t\t "+ jobTitle + "\n\tage:\t\t\t " + age +"\n\tpto amount:\t\t "+ numOfPto + "\n\tSalary: \t\t $" +salary + "\n\tis full time?\t "+ isFullTime+ "\n\tis married?\t\t " + isMarried +"\n\tgender: \t\t "+ gender + "\n\tsuite:\t\t\t " +suite;


        System.out.println(fullReport);

        /*
        full report
        first name:   tom
        last name:    jerry
         company name: loop camp
         job tile:    sdet
         age:          30
         pto amount:   21
         salary        120000.00
         is full time?  true
         is married?    false
         gender:        m
         suite          a

         */



    }
}
