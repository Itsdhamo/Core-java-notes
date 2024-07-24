package Revision4;

public class Strong {
	static int fact(int rem) {
		int prod=1;
		for(int i=1;i<=rem;i++) {
			prod=prod*i;
		}
		return prod;
	}
public static void main(String[] args) {
	int num=145,temp=num,sum=0;
	while(num>0) {
		int rem=num%10;
		sum=sum+fact(rem);
		num=num/10;
	}
	if(sum==temp) {
		System.out.println("Strong Number...");
	}
	else {
		System.out.println("Not A Strong Number...");
	}
}
}
