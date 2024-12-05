package day22_arrays;

public class LongShortString {
    public static void main(String[] args) {

        String [] words = {"java", "selenium", "softskills", "mentors"};
        String longest = words[0];
        String shortest = words[0];

        for( String eachElem  : words  ) {
            if( eachElem.length()>longest.length()){
                longest = eachElem;

            }
            if( eachElem.length()<shortest.length()){
                shortest = eachElem;
            }
        }

        System.out.println("longest string: "+longest);
        System.out.println("shortest string: "+shortest);

    }
}
