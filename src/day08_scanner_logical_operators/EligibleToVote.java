package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {

        String name ="Tom Jerry";
        boolean isCitizen = true;
        boolean isCriminal = false;
        int age = 30;

        boolean isEligible = isCitizen && !isCriminal && age > 18;
        System.out.println(" is eligible to vote " +isEligible);



       name ="james bong";
       isCitizen = true;
      isCriminal = false;
     age = 18;

       isEligible = isCitizen && !isCriminal && age >= 18;
        System.out.println(" is eligible to vote " +isEligible);

    }
}
