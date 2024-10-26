package day03_comments_escape_sequence;

public class Quotes {
    public static void main(String[] args) {
        System.out.println("Everyone loves java programming");


        /*
            Q: how if i want to print it with double quotes like below
            - Everyone loves "java: programming
         */
        System.out.println("\"Everyone loves java programming\"");

        /*
        q: since we use \ slash as part of the syntax, then how do i print backward slash itself
        -there programming languages like java\python

        first backward slash is for the syntax
        second one is for theo output text to be printed in the console

         */
        System.out.println("there programming languages like java\\\\python");
// for foward slash we dont need anything
        System.out.println("/");



    }
}
