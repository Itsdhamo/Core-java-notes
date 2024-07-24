package revision3;

public class ArmstrongNumber2 {
	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
		int num=i,temp=num,prod=1,sum=0;
		while(num>0) {
			int rem=num%10;
			prod=rem*rem*rem;
			sum=sum+prod;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+"ARMSTRONG...");
		}
//		else
//			System.out.println("NOT A ARMSTRONG...");
	}
}
}