package collection;

public class MainClass7 {
public static void main(String[] args) {
	String s1="Madam".toLowerCase();
	String s2=" ".trim();
   for(int i=s1.length()-1;i>=0;i--) {
	   s2=s2+s1.charAt(i);}
	   if(s1.equals(s2)) {
		   System.out.println("the given string is palindrome");
	   }
	   else 
		   System.out.println("not a palindrome");
   
	   
}
}
