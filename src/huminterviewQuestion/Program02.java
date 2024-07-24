package huminterviewQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Program02 {
	public static boolean isanagram(String str1,String str2) {
		String s1=str1.replaceAll("\\s","");
		String s2=str2.replaceAll("\\s","");
		boolean status=true;
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
			char []a1=s1.toLowerCase().toCharArray();
			char []a2=s2.toLowerCase().toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			 status=Arrays.equals(a1,a2);
		}
		return status;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string 1 = ");
	String str1=sc.next();
	System.out.println("Enter the string 2 = ");
	String str2=sc.next();
	boolean status=isanagram(str1, str2);
	if(status) {
		System.out.println(str1+" & "+str2+" is anagram");
	}
	else
		System.out.println(str1+" & "+str2+" is not an anagram");
}
}
