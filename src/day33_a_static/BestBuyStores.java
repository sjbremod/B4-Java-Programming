package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {

        BestBuy store1 = new BestBuy("Arlington, VA");
        BestBuy store2 = new BestBuy("Paramus, NJ");
        BestBuy store3 = new BestBuy("Orlando, FL");


        //calling static member by object ref is fine but not good practice
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

         // proper way to call the static members
        System.out.println(BestBuy.headquarter);

        // can i call the instance members by class name?

        System.out.println("*********");
        BestBuy.headquarter = "900 test st south , Richfield , ALaska";
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        System.out.println("--------------------------");
       // instance method / members cantNOT be reach by class name
        //BestBuy.openStore();
        store1.openStore();
        store2.openStore();
        store3.openStore();
        System.out.println("--------------------------");

        BestBuy.specialsDaySale();




    }
}
