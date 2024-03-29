package code.bind.stack;

import java.util.Stack;

public class ParenthesisBalanced {

	public static void main(String[] args) {
		// String expr = "([{}])";

		String expr = "([{}])}";
		// Function call
		if (areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

	private static boolean areBracketsBalanced(String expr) {
		Stack<Character> stk = new Stack<Character>();
		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '{' || x == '[' || x == '(') {
				stk.push(x);
			}
			if (x == '}' || x == ']' || x == ')') {
				if (stk.isEmpty())
					return false;

				char popedElement = stk.peek();

				if (
						(popedElement == '{' && x == '}') 
						|| (popedElement == '[' && x == ']'  )
						|| (x == ')' && popedElement == '(')
						) {
					stk.pop();
				} else
					return false;

			}
		}
		return stk.isEmpty();
	}
}
