package org.mindhub.collections;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		
		System.out.println(stack.peek());
		
		System.out.println(stack.get(0));

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}

}
