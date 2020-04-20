package com.kdrtut.collections;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("A");
        stack.add("B");
        stack.add("C");

        System.out.println(stack);
        System.out.println(stack.search("A"));
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.search("Z"));
    }
}
