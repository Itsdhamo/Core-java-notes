package ZohoInterview;

import java.util.HashSet;
import java.util.Set;

public class Program9 {
public static void main(String[] args) {
	String str="bbb";
	char[] arr=str.toCharArray();
	Set<Character> setitems=new HashSet<Character>();
	StringBuilder stb=new StringBuilder();
	for(int i=0;i<arr.length;i++) {
		setitems.add(arr[i]);
	}
	for(char ch:setitems) {
		stb.append(ch);
	}
	System.out.println(stb.length());
}
}