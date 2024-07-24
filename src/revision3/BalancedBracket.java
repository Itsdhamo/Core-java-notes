package revision3;

import java.util.*;

public class BalancedBracket {
	public static boolean balancedpara(String str) {
		Stack stack = new Stack();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char current = ch[i];

			if (current == '{' || current == '[' || current == '(') {
				stack.push(current);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char popchar;
			switch (current) {
			case ')':
				popchar = (char) stack.pop();
				if (popchar == '{' || popchar == '[')
					return false;
				break;
			case '}':
				popchar = (char) stack.pop();
				if (popchar == '(' || popchar == '[')
					return false;
				break;
			case ']':
				popchar = (char) stack.pop();
				if (popchar == '{' || popchar == '(')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string = ");
		String str = sc.next();
		if (balancedpara(str))
			System.out.println(str + " is balanced...");
		else
			System.out.println(str + " is not balanced");
		sc.close();
	}
}