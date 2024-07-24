package collection;

import java.util.Scanner;

class checkException extends Exception{
	checkException() {
	     System.out.println("exception object is created");
	}
}
public class MainClass6 {
	public static void check(int age) {
		try {
			checked(age);
		} catch (checkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void checked(int age) throws checkException{
		
		if(age<30) {
			System.out.println("age factor is crt");
		}
		else {
			throw new checkException();
		}
	}
public static void main(String[] args) {
	for(;;) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the age = ");
	int age=sc.nextInt();
	MainClass6.check(age);
}}
}
