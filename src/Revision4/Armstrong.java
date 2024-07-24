package Revision4;

public class Armstrong {
public static void main(String[] args) {
	int num=153,temp=num,cube,sum=0;
	while(num>0) {
		int rem=num%10;
		cube=rem*rem*rem;
		sum=sum+cube;
		num=num/10;
	}
	if(temp==sum) {
		System.out.println("ARMSTRONG NUMBER...");
	}
	else {
		System.out.println("NOT A ARMSTRONG NUMBER...");
	}
}
}
