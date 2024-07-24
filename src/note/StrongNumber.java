package note;

public class StrongNumber {
static int fact(int rem) {
	int fact=1;
	for(int i=1;i<=rem;i++) {
		fact=fact*i;
	}
	return fact;
}
	public static void main(String[] args) {
	 int num=145,sum=0,temp=num;
	 while(num>0) {
		 int rem=num%10;
		 sum=sum+fact(rem);
		 num=num/10;
	 }
	 if(temp==sum) {
		 System.out.println("STRONG NUMBER");
	 }
	 else
		 System.out.println("NOT A STRONG NUMBER");

	}

}
