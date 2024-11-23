package day10_if_statements;

public class CheckCharacter {
    public static void main(String[] args) {
        char letter = 'B';
        //if (letter >= 'a' && letter <='z'){
        if('a' <= letter && letter <= 'z'){ // this is using the ascii value to do this operation
            System.out.println("lowercase");
        }
        if('A' <= letter && letter <= 'Z'){
            System.out.println("uppercase");

        }




    }
}
