package day19_nested_loops;
/*
    1 month - 4 weeks.
    each week we have 7 days

 */
public class Month {
    public static void main(String[] args) {


        for (int i = 1; i <=4 ; i++) {
            System.out.println("week "+ i);
            for (int j = 1; j <=7 ; j++) {
                System.out.println("\tday "+j);
                for (int k = 1; k <=24 ; k++) {
                    System.out.println("\t\thour "+ k);
        }
            System.out.println();



            }
        }

    }
}
