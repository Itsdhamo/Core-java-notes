package revision3;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Fibonacci number = ");
		int n=sc.nextInt();
		int  a = 0, b = 1, c=0;
		if (n == 0) {
			System.out.println(a);
		} else if (n == 1 || n == 2) {
			System.out.println(b);
		} else
			System.out.println(a);
		System.out.println(b);
        n=n-2;
        while(n>0) {
        	c=a+b;
        	System.out.println(c);
        	n--;
        	a=b;
        	b=c;
        }
	}
}
