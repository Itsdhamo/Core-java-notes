package revision;
import java.util.Scanner;
public class Program11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String = ");
	String name=sc.next();
	char [] arr=name.toCharArray();
	char [] vowels= {'a','e','i','o','u'};
	for(int i=0;i<vowels.length;i++) {
		for(int j=0;j<arr.length;j++) 
			if(vowels[i]==arr[j])
			System.out.println(arr[j]+" is a vowels");
			}}}


