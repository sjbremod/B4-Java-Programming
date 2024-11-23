package day14_String;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String expectedUsername = "test@gmail.com";
        String expectedPassword = "test1234";

        System.out.print("Please enter your username: ");
        String inputUserName = key.next();
        System.out.print("Please enter your password: ");
        String inputPassword = key .next();

        // to be able to login
        // 1. username has to match without case sensitiveness ---> inputUsername.equalsIgnoreCase(expectedUsername)  boolean
        // 2. password needs to be 8 character long ----> inputPassword.length() ==8                                   boolean
        // 3. password needs to match exactly ---->  inputPassword.equals(expectedPassword)                           boolean

            boolean isValidName = inputUserName.equalsIgnoreCase(expectedUsername);
            boolean isValidLength = inputPassword.length()==8;
            boolean isValidPassword = inputPassword.equals(expectedPassword);

        if(isValidName && isValidLength && isValidPassword){
            System.out.println("LOGGED IN");
        }else{
            if(!isValidName){
                System.out.println("you entered an invalid name");
            }
            if(!isValidLength){
                System.out.println("your password length is not 8 characters");
            }
            if(!isValidPassword){
                System.out.println("Your password doesnt match");
            }
        }


// but we can also just do .tolowerCase for the username and then we don't need ignore case in the boolean



    }
}
