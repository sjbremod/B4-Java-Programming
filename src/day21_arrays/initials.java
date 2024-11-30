package day21_arrays;

public class initials {
    public static void main(String[] args) {
        String [] classMates= {"James Bond", "even rell", "Anna Johnson"};
        System.out.println("I have " +classMates.length+" full names.");

        for ( String eachFullName :  classMates ){
            //System.out.println(eachFullName);
            eachFullName= eachFullName.trim();
          String firstName= eachFullName.substring(0,eachFullName.indexOf(" ")).toUpperCase();
          String lastName=eachFullName.substring(eachFullName.indexOf(" ")+1).toUpperCase();
            System.out.println(""+firstName.charAt(0)+lastName.charAt(0));

        }
        /*
        TODO: home practice
        implememnt the same cde with the use of fori loop
from aslan
String str = "";

        for (String each : arr) {
            each = each.toUpperCase().trim();
            str += "" + each.charAt(0) + each.charAt(each.indexOf(" ")+1) + " ";
        }

        System.out.println(str);
         */
    }
}
