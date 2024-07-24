package revision;

public class FibonacciSeries {
public static void main(String[] args) {
	int num=15;
	int a=0,b=1;
	System.out.println("fibonacci series of "+a+","+b+"are");
	int nextterm;
	for(int i=2;i<num;i++){
		nextterm = a+b;
		a=b;
		b=nextterm;
		System.out.println("nextterm"+nextterm+",");
	}
}
}
