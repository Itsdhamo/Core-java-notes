package revision;
import java.util.Scanner;
public class Armstrong {
	static int pow(int rem,int dc) {
		int fact=1;
		for(int i=0;dc>=i;i++) {
			fact=fact*rem;
		}
		return fact;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number =");
	int num=sc.nextInt();
	int a=num,temp=num, sum=0,dc=0;
	if(num >=1 && num<=1000) {
		while(num>0) {
			dc++;
			num=num/10;
		}
		while(a>0) {
			int rem =num%10;
			sum=sum+pow(rem,dc);
			a=a/10;
		}
	}
	if(temp==sum) {
		System.out.println(sum+" is a ARMSTRONG NUMBER");
	}
	}
}