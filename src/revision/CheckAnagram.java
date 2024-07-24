package revision;
import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		String str = "manigandan";
		String reverse = "";
		int length = 10;
			
		boolean anogramstat = false;
		for(int i=0;i<length;i++) {
		reverse = str.charAt(i)+reverse;	
		}
		System.out.println("reverse:"+reverse);
		if(str.length()!= reverse.length()) {
			System.out.println(str+" and"+reverse+" not anograms String");
		}else {
			char[] manigandan = str.toCharArray();
			char[] namipnangai = reverse.toCharArray();
			Arrays.sort(manigandan);
			Arrays.sort(namipnangai);
			anogramstat = Arrays.equals(manigandan,namipnangai);
		}
if(anogramstat == true) {
	System.out.println("my status is anogram string");
}else {
	System.out.println("my status is not anogram string");
}
	}

}
