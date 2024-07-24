package secondrevision;

public class ArmStrong {
public static void main(String[] args) {
	int num=153,temp=num,cube =0,sum=0;
	while(num>0) {
		int rem=num%10;
		cube=rem*rem*rem;
		sum=sum+cube;
		num=num/10;
	}
	if(temp==sum) {
		System.out.println("ArmStrong Number...");
	}
	else
		System.out.println("Not a ArmStrong Number...");
}
}
