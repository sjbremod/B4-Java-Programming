package day33_b_encapsulation.login;

public class UseLogin {
    public static void main(String[] args) {

        Login user1 = new Login("loopcamp","hello&123");
        // since username and passoword instance variables are private access modifiers i can not reach them.
//        System.out.println(user1.username);
//        System.out.println(user1.password);

       // System.out.println(user1);

        // but how can i access indirectly
        System.out.println(user1.getPassword("loop"));
        System.out.println(user1.getPassword("loopcamp"));

        user1.setPassword("loopcamp","bye@123");


        user1.setPassword("lopcamp","byeee@123");


        user1.setPassword("loopcamp","byeee@123");
        System.out.println(user1.getPassword("loopcamp"));

        //username instance variable is private
        //not accessible outside the class
        // since there is no public setter/getter, we don't have indirect access either

//        user1.username = "tom";
//        user1.getUsername();
//        user1.setUsername("");


    }


}
