package day24_methods;

public class Email {
    public static void main(String[] args) {

        String fullName= "Tom Jerry";
        String domain= "Gmail.com"; //.gmail.com

       // fullName.substring(0,1)+fullName.substring(fullName.indexOf(" ")+1)+@+domain;4
buildEmail("micky Mouse", "outlook.com");
    }

    public static void buildEmail (String fullName, String domain){
        /*
        TODO: home practice
            make sure that user give you fulklk name with 2 words
            and domanin contains @
            if does not
                give message saying the reason why
         */
        String result =  (fullName.substring(0,1)+fullName.substring(fullName.indexOf(" ")+1) + "@" + domain).toLowerCase();
        System.out.println(result);
    }

}
