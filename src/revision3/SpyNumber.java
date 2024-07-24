package revision3;

public class SpyNumber {
public static void main(String[] args) {
	int num=22,sum=0,prod=1;
	while(num>0) {
		int rem=num%10;
		sum=sum+rem;
		prod=prod*rem;
		num=num/10;
	}
	if(sum==prod) {
		System.out.println("SPY");
	}
	else {
		System.out.println("NOT SPY");
	}
}
}
