package collection;

public class SpyNumber {
public static void main(String[] args) {
	int num=123,sum=0,prod=1;
	while(num>0) {
		int rem=num%10;
		sum=sum+rem;                       
		prod=prod*rem;                     
		num=num/10;
	}
	if(sum==prod) {
		System.out.println("SPY NUMBER...");
	}
	else
		System.out.println("NOT A SPY NUMBER...");
}
}
