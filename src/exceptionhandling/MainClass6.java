package exceptionhandling;

import java.util.Scanner;

class InvalidCharacterLengthException extends Exception{
	public InvalidCharacterLengthException() {
		System.out.println("InvalidCharacterLengthException");
	} 
}
public class MainClass6 {
	public static void pass(String str) {
		try {
			passed(str);
		} catch (Exception e) {
		 e.printStackTrace();
	}}
	private static void passed(String str) throws InvalidCharacterLengthException {
			int size =6;
		   char[] arr=str.toCharArray();
		  int strsize= arr.length;
		  if(size == strsize) {
			  System.out.println("correct size of length");
		  }
		  else {
			  throw new InvalidCharacterLengthException();
		  }
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the password with 6 char");
    System.out.println("Enter The password : ");
    String str=sc.next();
   pass(str);     
}
}
