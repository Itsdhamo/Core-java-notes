package note;

public class FibonacciRecursion {
	static int fib(int num) {
		if(num==0) {
			return 0;
	}
	else 
		return fib(num-1)+fib(num-2);
	}

	public static void main(String[] args) {
		int num=8;
		System.out.println(fib(num));

	}

}
