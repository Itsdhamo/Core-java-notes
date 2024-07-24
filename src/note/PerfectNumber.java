package note;

public class PerfectNumber {

	public static void main(String[] args) {
	 int n=28,sum=0;
	 for(int i=1;i<n;i++) {
		 if(n%i==0) {
			 sum=sum+i;
		 }
	 }
	 if(sum==n) {
		 System.out.println("PERFECT NUMBER");
	 }
	 else
		 System.out.println("NOT A PERFECT NUMBER");

	}

}
