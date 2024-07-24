package revision3;

public class StrongNumber {
	public static int fact(int rem){
		int fact=1;
		for(int i=rem;i>0;i--) {
			fact=fact*i;
		}
		return fact;
	}
public static void main(String[] args) {
	int num=145,temp=num,sum=0;
	while(num>0) {
		int rem=num%10;
		sum=sum+fact(rem);
		num=num/10;
	}
	if(temp==sum) {
		System.out.println("STRONG NUMBER...");
	}
	else
		System.out.println("NOT A STRONG NUMBER...");
}
}
