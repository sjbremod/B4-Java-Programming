package day09_b_if_Statements;

public class SingleIfStatement {
    public static void main(String[] args) {
        if (true) {
            System.out.println("1st print statement");
        }
        System.out.println("2nd print statement");
        // single if statement
        if (true) {
            System.out.println("3rd print statement");
        }
        // if statements withe realtional operators which results in boolean  ---> true/false
        System.out.println("-------------------");
        int score = 75;
        if (score >= 75) {
            System.out.println("you pass the exam ");
        }
        if (score < 75) {
            System.out.println("you failed");
        }
        // if statements withe realtional operators which results in boolean  ---> true/false
        System.out.println("-------------------");
        int year = 2028; // 2019, 2020, 2021
        boolean isCovidQuarantineYear = year == 2019 || year == 2020 || year == 2021;
        //  boolean isCovidQuarantineYear = year >=2019 && year <=2021;// there is not one solution
        if (isCovidQuarantineYear){
            System.out.println(year + " was a covid quarantine year. ");

        }
        if (!isCovidQuarantineYear) {
            System.out.println(" it is not a covid year. go out and enjoy");


        }
        if (isCovidQuarantineYear == false ){
            System.out.println(" it is not a covid year. go out and enjoy" );
        }
            }
}
