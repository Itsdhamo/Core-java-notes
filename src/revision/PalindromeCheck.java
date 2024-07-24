package revision;

public class PalindromeCheck {
public static void main(String[] args) {
		String Str = "rotor";
		String reverse = "";
		int length = Str.length();
		for(int i=0;i<length;i++) {
			reverse = Str.charAt(i)+reverse;
			//System.out.println(reverse);
			if (reverse == Str) {
			System.out.println(reverse);
			}
		}
		if( Str. equals(reverse)) {
			System.out.println("palindrome");}
		else {	
System.out.println("not palindrome");
		}

}
}
