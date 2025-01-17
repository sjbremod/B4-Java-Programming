package day41_collection.list;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {


        Stack <Character> stack = new Stack<>();

        //add we use push()
        //remove we use pop() removes the element which is at the top / and returns
        // get we use peek()  gives you the element which is at the top

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);  //

        System.out.println("what is at the top " + stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println("what is at the top " + stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println();
        System.out.println(stack);
        stack.remove(0);
        System.out.println(stack);


    }
}
