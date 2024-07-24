package extra;
public class PerfectNumber {
	static int fact(int rem,int dc) {
		int prod=1;
		for(int i=1;i<=dc;i++) {
			prod=prod*rem;
   		 }		 
		return prod;

	}
public static void main(String[] args) {
	int num=153,b=num,a=num,sum=0,dc=0;
	while(b>0) {
	  b=b/10;
	  dc++;
	}
	while(num>0) {
		int rem=num%10;
		sum=sum+fact(rem,dc);
		num=num/10;
	}
	if(a==sum) {
		System.out.println(a+" is a perfect number");
	}
	else
		System.out.println(a+" is not a perfect number");
System.out.println("-----------");
int x=10,y=20;
System.out.println("before swapping :"+x+" & "+y);
 x=x+y;
 y=x-y;
 x=x-y;
 System.out.println("after swapping :"+x+" & "+y);
 System.out.println("----------");
}}
