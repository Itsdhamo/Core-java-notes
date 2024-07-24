package revision3;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number for check if the number is palindrome or not ?");
	int num=sc.nextInt();
	int temp=num,rev=0;
	while(num>0) {
		int rem=num%10;
		rev=rem+rev*10;
		num=num/10;
	}
	if(temp==rev) {
		System.out.println("Palindrome...");
	}
	else
		System.out.println("Not a Palindrome...");
    }
    }