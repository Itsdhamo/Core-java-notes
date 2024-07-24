package revision;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	System.out.println("input your ages");
	Scanner sc =new Scanner(System.in);
	String s = sc.nextLine();
	int age = Integer.parseInt(s);
	if(age >= 18) {
		System.out.println("input your favo food");
		String food = sc.nextLine();
		if (food.equals("pizza")) {
			System.out.println("mine too");
		}else {
				System.out.println("not mine");
			}
		
	}
	else if(age >= 13) {
		System.out.println("you are a teenager");
	}
	
	else {
		System.out.println("you are not a teenager or a adult");
	}
}
}
