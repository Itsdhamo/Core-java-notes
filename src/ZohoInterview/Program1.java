package ZohoInterview;

public class Program1 {
	public static String reversed(String str) {
		char[] arr = str.toCharArray();
		int startindex = 0;
		int endindex = str.length() - 1;
		while (startindex < endindex) {
			if (!Character.isLetterOrDigit(arr[startindex])) {
				startindex++;
			} else if (!Character.isLetterOrDigit(arr[endindex])) {
				endindex--;
			} else {
				char temp = arr[startindex];
				arr[startindex] = arr[endindex];
				arr[endindex] = temp;
				startindex++;
				endindex--;
			}
		}
		return String.valueOf(arr);
	}
	public static void main(String[] args) {
		String str = "house no : 123@ cbe";
		System.out.println(reversed(str));
	}
}