package revision3;
import java.util.Scanner;
import java.util.Stack;
public class BalancedParanthesis {
	public static int checking(String str) {
	 char[] arr=str.toCharArray();
	 int count=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]=='[' || arr[i]=='<' || arr[i]=='(' || arr[i]=='{' ) {
			 count++;
		 }
	 }
	 for(int j=0;j<arr.length;j++) {
		 if(arr[j]==']' || arr[j]=='>' || arr[j]==')' || arr[j]=='}' ) {
			 count--;
		 }
	 }
		return count;
	}
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the paranthesis = ");
		String str=sc.next();
		int num=checking(str);
		if(num==0) {
			System.out.println(checking(str));
			System.out.println(str+" is balanced bracket");
		}
		else
			System.out.println(checking(str));
			System.out.println("not balanced");
	}
}