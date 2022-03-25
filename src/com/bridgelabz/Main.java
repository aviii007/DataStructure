package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Stacks and Queues Program");
        System.out.println("STACK");
        Stack stack = new Stack();
        stack.push("ashvini");
        stack.push("is");
        stack.push("name");
        stack.push("my");

        stack.pop(); //will remove is
        stack.showElements();
        stack.pop(); //will remove name
        stack.showElements();
        stack.pop(); //will remove my
        stack.showElements();
        System.out.println("----------------");

    }
}
