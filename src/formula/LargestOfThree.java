package formula;
public class LargestOfThree {
	static void largest(int a,int b) {
		if(a>b) {
			System.out.println(a+" is a largest one");
		}
		else
			System.out.println(b+" is a largest one");
	}
	static void largest(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a+" is a largest one");
		}
		else if(b>c) {
			System.out.println(b+" is a largest one");
		}
		else
			System.out.println(c+" is a largest one");
	}
	public static void main(String[] args) {
		largest(10,100);
		largest(10,400,300);
		largest(10000,50,5);
	}
}
