package revision;

public class Program3 {
public static void main(String[] args) {
	Object o1=new Object();
	Object o2=new Object();
	String s1=o1.toString();
	String s2=o2.toString();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(o1.hashCode());
	System.out.println(o2.hashCode());
	System.out.println(o1.equals(o2));
}
}
