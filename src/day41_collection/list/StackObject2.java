package day41_collection.list;

import java.util.Stack;

public class StackObject2 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        s.push(10);
        s.push((int)20.0); // converted double  explicit casting to int implicit casting to Integer
        System.out.println(s);
        s.push(30);
        s.push(40);
        s.pop();
        s.pop();
        System.out.println(s.peek());

    }
}
