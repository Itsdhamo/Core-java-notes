package revision3;

public class StrongNumber2 {
	public static int fact(int rem) {
		int fact = 1;
		for (int i = rem; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 1000000; i++) {
			int num = i, temp = num, sum = 0;
			while (num > 0) {
				int rem = num % 10;
				sum = sum + fact(rem);
				num = num / 10;
			}
			if (temp == sum) {
				System.out.println(temp + " IS A STRONG NUMBER");
			}
		}
	}
}
