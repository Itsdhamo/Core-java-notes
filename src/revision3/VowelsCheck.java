package revision3;

public class VowelsCheck {
	public static void main(String[] args) {
		String name = "Dhamodaran".toLowerCase();
		char[] arr = name.toCharArray();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (arr[i] == vowels[j]) {
					System.out.println(arr[i] + " is presented in a String");
				}
			}
		}
	}
}