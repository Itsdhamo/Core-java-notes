package revision3;

public class NeonNumber {
public static void main(String[] args) {
	int num=9,sqr=num*num,sum=0;
	while(sqr>0) {
		int rem=sqr%10;
		sum=sum+rem;
		sqr=sqr/10;
	}
	if(num==sum) {
		System.out.println("NEON NUMBER...");
	}
	else
		System.out.println("NOT A NEON NUMBER...");
}
}
