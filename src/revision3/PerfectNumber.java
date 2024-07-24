package revision3;

public class PerfectNumber {
	public static void main(String[] args) {
		for (int j = 1; j <= 1000; j++) {
			int num = j, sum = 0;
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}
			if (num == sum) {
				System.out.println(num + " is a Perfect Number...");
			}
		}
	}
}