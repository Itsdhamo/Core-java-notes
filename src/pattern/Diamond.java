package pattern;

public class Diamond {
	public static void main(String[] args) {
		{
			for (int i = 1; i <= 5; i++) {
				for (int s = 5; s > i; s--) {
					System.out.print("  ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(" " + j);
				}
				for (int k = 1; k < i; k++) {
					System.out.print(" " + (i - k));
				}
				System.out.println();
			}
			for (int x = 5; x > 1; x--) {
				for (int s2 = 6; s2 > x; s2--) {
					System.out.print("  ");
				}
				for (int y = 1; y < x; y++) {
					System.out.print(" " + y);
				}
				for (int z = 2; z < x; z++) {
					System.out.print(" " + (x - z));
				}
				System.out.println();
			}
		}
	}
}