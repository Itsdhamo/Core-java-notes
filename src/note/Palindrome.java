package note;

public class Palindrome {

	public static void main(String[] args) {
		int num=12321,rev=0,temp=num;
		while(num>0) {
			int rem= num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("PALINDROME");}
			else
				System.out.println("NOT A PALINDROME NUMBER");
		

	}

}
