package revision;

public class Program7 {
	public static void main(String[] args)
	{
	String s1="java developer";
	String s2="java";
	String s3="java";
	System.out.println(s1.charAt(5));
	System.out.println(s1.lastIndexOf('e'));
	System.out.println(s1.length());
	System.out.println(s1.endsWith("per"));
	System.out.println(s1.startsWith("ja"));
	System.out.println(s1.toUpperCase());
	System.out.println(s1.replace('p','v'));
	System.out.println(s2.equalsIgnoreCase(s3));
	System.out.println(s2.compareTo(s3));
	}
}
