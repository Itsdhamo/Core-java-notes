package interviewprogram;
class A{
	public A(int x) {
	
	}
}
class B extends A{

	public B(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	
}
public class Program2nd {
public static void main(String[] args) {
	A a1=new B(0);
	System.out.println("complete");
}
}
