package revision3;

public class ArmStrongNumber {
public static void main(String[] args) {
	int num=153,temp=num,prod=1,sum=0;
	while(num>0) {
		int rem=num%10;
		prod=rem*rem*rem;
		sum=sum+prod;
		num=num/10;
	}
	if(temp==sum) {
		System.out.println("ARMSTRONG...");
	}
	else
		System.out.println("NOT A ARMSTRONG...");
}
}
