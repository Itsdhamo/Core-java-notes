package exceptionhandling;

import java.util.Scanner;

class NumberNotFoundException extends Exception{
	public void check() {
		System.out.println("hey plz enter valid number");
	}
}
public class MainClass7{
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number =");
		int num=sc.nextInt();
		try {
			checking(num);
		} catch (NumberNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void checking(int num)throws NumberNotFoundException {
		if(num>100) {
			System.out.println("the number was correctly entered...");
		}
		else
			throw new NumberNotFoundException();
		
 
	}
}
