package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitle {
    public static void main(String[] args) {

        ArrayList <String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET", "Developer", "PO", "CEO","DevOps","QA","QE","BA", "PO"));
        System.out.println("original: "+ allJobs);

        //removeAll() method
        ArrayList<String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("QA","PO","QE","BA"));
        System.out.println("after 1st remove:"+ jobs1);

        //.retainAll()
        ArrayList <String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET", "Developer", "DevOps"));
        System.out.println("after 2nd remove: "+ jobs2);

        //.containsAll()

        ArrayList <String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("DevOps", "PO")));
        System.out.println(jobs3.containsAll(Arrays.asList("DevOps", "PO","QI")));// false because QI isnt in the list

    }
}
