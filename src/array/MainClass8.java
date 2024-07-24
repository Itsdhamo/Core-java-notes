package array;

public class MainClass8 {
public static void main(String[] args) {
	String str="java";
	for(int i=0;i<str.length();i++) {
		char ch1=str.charAt(i);
		//System.out.println(ch1);
		for(int j=i;j<str.length();j++) {
			char ch2=str.charAt(j);
			
		if(ch1==ch2) {
			System.out.println("duplicated value = "+ch1);
		}}
	}
}
}
