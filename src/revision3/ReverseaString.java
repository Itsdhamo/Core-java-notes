package revision3;

public class ReverseaString {
public static void main(String[] args) {
	String str="Dhamo";
	String str1=" ".trim();
	char[] arr=str.toCharArray();
	for(int i=arr.length-1;i>=0;i--) {
		str1=str1+arr[i];
	}
	System.out.println(str1);
}
}
