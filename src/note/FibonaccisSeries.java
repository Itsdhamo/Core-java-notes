package note;

public class FibonaccisSeries {

	public static void main(String[] args) {
	int num=9,a=0,b=1;
	if(num==0) {
		System.out.println(a);
	}else
		System.out.println(a);
	    System.out.println(b);
        num=num-2;
        while(num>0) {
        	int c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        num--;
        } 
	}
}
