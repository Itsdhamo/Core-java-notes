package ZohoInterview;

import java.util.Scanner;

public class Program7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the character =");
	String input=sc.next();
	char[] arr=input.toCharArray();
	int count=0;
	int fullcount=26;
	int length=arr.length;
	for(int i=0;i<arr.length;i++) {
		int num=(int)arr[i];
		if(length==1) {
			for(int j=65;j<=num;j++) {
				count++;
			}
		}
		else if(length==2) {
			int num1=(int)arr[i];
			for(int z=65;z<=num1;z++) {
				count++;
			}
		}
	}
	if(length==2) {
		count=count+fullcount-1;
	}
	System.out.println(count);
}
}