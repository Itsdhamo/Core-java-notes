
package note;

public class SpyNumber {

	public static void main(String[] args) {
	 int num=132,sum=0,prod=1;
	 while(num>0) {
		 int rem=num%10;
		 sum=rem+sum;
		 prod=rem*prod;
		 num=num/10;
	 }
	 if(sum==prod) {
		 System.out.println("SPY Number");
	 }
	 else
		 System.out.println(" Not A SPY Number");

	}

}
