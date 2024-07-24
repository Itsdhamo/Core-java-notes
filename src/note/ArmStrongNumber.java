package note;
import java.util.Scanner;
public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number");
				int num=sc.nextInt();
		int sum=0,temp=num;
		while(num>0) {
			int rem=num%10;
			int pow = rem*rem*rem;
			sum=sum+pow;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("ARMSTRONG NUMBER");
		}
		else
			System.out.println("NOT A ARMSTRONG NUMBER");

	}

}
