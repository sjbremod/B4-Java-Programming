package day40_exception.throws_keyword;

public class UsingThrows {
    public static void main(String[] args)  {

        //Thread.sleep(-2000); // Compile time Exception (Checked Exception) + may have Runtime Exception


        /*
            with exceptions, we have two options
                    1) handle it with --> try catch block
                    2) Do not handle it --> By pass it to someone else


         */
        test1(200); // handled with a try catch in the method


        //test2(200);  // to use it we need to either handle it with a try catch or BYpass to (throws)








    }

    public static void test1 (int millis){
        // handling it with try-catch block
        try {
            Thread.sleep(-millis); // when minus value provided --> IllegalArgumentException
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test2 (int millis) throws InterruptedException {
        // 2 Bypass it to anyone that calls this method  // NOT HANDLING IT
        Thread.sleep(millis);
    }



}

