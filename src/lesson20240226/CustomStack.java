package lesson20240226;

import java.util.LinkedList;

public class CustomStack {

    private LinkedList<String> list = new LinkedList<>();

    public void push(String element) {
        list.addLast(element);
    }

    public String pop(){
        return list.removeLast();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }


}
