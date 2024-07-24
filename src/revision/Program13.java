package revision;

public class Program13 {
public static void main(String[] args) {
	String s1="malayalam" ;
	String s2=" ".trim();
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);}
System.out.println(s1.equals(s2));

}
}
 