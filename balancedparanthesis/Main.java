package balancedparanthesis;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter expression: ");
		String expression = scanner.nextLine();
		scanner.close();
		int length = expression.length();
		Stack stack = new Stack(length);
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < length; i++) {
			char ch = expression.charAt(i);

			if (ch == '(') {
				stack.push(i);
			} else if (ch == ')') {
				long p = (stack.pop() + 1);
				System.out.println("')' at index " + (i + 1) + " matched with '(' at index " + p);
			}
		}
		if(!stack.isEmpty()) {
			System.out.println("'(' at index " + (stack.pop() + 1) + " is unmatched");
			System.out.println("Arithmetic Expression is not balanced");
		}
		else{
			System.out.println("Arithmetic Expression is balanced");
		}
	}
}
