package exceptionhandling;

import java.util.Scanner;

class passwordnotcorrectexcpetion extends Exception{
}
public class PasswordNotCorrectException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password = ");
		String password=sc.next();
		check(password);
	}
	private static void check(String password) {
		try {
			checked(password);
		} catch (Exception e) {
		 e.printStackTrace();
		}
	}
	private static void checked(String password) throws passwordnotcorrectexcpetion{
		if(password.length()>10) {
			System.out.println("the password is correct...");
		}
		else {
			throw new passwordnotcorrectexcpetion();
	}}
}
