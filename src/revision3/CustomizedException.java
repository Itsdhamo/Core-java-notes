package revision3;

import java.util.Scanner;

class InvalidException extends Exception{
 InvalidException() {
	System.out.println("plz enter correct number...");
}
}
public class CustomizedException {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number = ");
	int num=sc.nextInt();
	check(num);
}
public static int check(int num) {
	try {
		return checking(num);
	} catch (InvalidException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return num;
}
private static int checking(int num) throws InvalidException{
	if(num>100) {
		System.out.println("checking number is correct...");
	}
	else
		throw new InvalidException();
	return num;
}
}
