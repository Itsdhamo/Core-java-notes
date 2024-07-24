package revision;

public class Program5 {
public static void main(String[] args) {
	String s1=new String();
	String s2=new String("dhamo");
	char [] s3= {'d','h','a','m','o'};
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
	System.out.println(s1.equals(s3));
}
}
