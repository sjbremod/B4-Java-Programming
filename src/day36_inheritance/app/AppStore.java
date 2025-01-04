package day36_inheritance.app;

public class AppStore {
    public static void main(String[] args) {


        Instagram instagram = new Instagram(23.5);
        System.out.println(instagram.version);
        System.out.println(instagram.name);
        instagram.postPicture();
        instagram.download();


        /*
        object reference 'instagram' has access: 2 instance variables from parent class
        1 instance method from parent class
        1 instance method from itself

         */

        System.out.println();
        Facebook facebook= new Facebook(27.2);
        System.out.println(facebook.version);
        System.out.println(facebook.name);
        facebook.watchVideo();
        facebook.download();

    }
}
