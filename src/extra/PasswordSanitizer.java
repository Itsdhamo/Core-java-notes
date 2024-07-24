package extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordSanitizer {
	public static void utilityMethodFilter(List li) {
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the password");
	String str=sc.nextLine();
	List li=new ArrayList();
	li.add(str);
	System.out.println("Enter the password");
	String str2=sc.nextLine();
	li.add(str2);
	System.out.println("Enter the password");
	String str3=sc.nextLine();
	li.add(str3);
	System.out.println("Enter the password");
	String str4=sc.nextLine();
	li.add(str4);
	System.out.println("Enter the password");
	String str5=sc.nextLine();
	li.add(str5);
	for(Object o1:li) {
	   utilityMethodFilter(li);
	}
}
}
