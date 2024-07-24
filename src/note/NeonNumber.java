package note;

public class NeonNumber {

	public static void main(String[] args) {
		int n=9,pow=n*n,sum=0;
		while(pow>0) {
			int rem =pow%10;
			sum=sum+rem;
			pow=pow/10;
		}
		if(n==sum) {
			System.out.println("NOEN NUMBER");
		}
		else
			System.out.println("NOT A NEON NUMBER");

	}

}
