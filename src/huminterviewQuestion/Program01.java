package huminterviewQuestion;

public class Program01 {
public static void main(String[] args) {
	for(int i=0;i<=100;i++) {
		int num=i,temp=num,rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp == rev) {
			System.out.println(temp+" is a palindrome...");
		}
	}
}
}
