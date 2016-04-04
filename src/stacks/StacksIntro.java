package stacks;

import java.util.Stack;

public class StacksIntro {
	public static void main(String[] args) {
		Stack<Integer> first = new Stack<Integer>();
		first.push(1);
		first.push(6);
		first.push(328);
		int size = first.size();
		for (int i = 0; i < size; i++)
			System.out.println(first.pop());

		StacksIntro r = new StacksIntro();
	}

	public StacksIntro() {
		String x = "Hello";
		String z = StringReverse(x);
		System.out.println(z);
	}

	public String StringReverse(String s) {
		Stack<Character> reverse = new Stack<Character>();
		String y = "";
		int size = s.length();
		for (int i = 0; i < size; i++) {
			reverse.push(s.charAt(i));
			y += reverse.pop();
		}

		return y;
	}
}
