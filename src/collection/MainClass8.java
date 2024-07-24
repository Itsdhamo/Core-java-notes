package collection;

public class MainClass8 {
public static void main(String[] args) {
	String s1="java";
	for(int i=0;i<s1.length();i++){
		for(int j=i;j<s1.length();j++) {
			if(s1.charAt(i) == s1.charAt(j)) {
				System.out.println(s1.charAt(i));
			}
		}
	}
}
}
