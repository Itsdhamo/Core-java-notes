package ZohoInterview;

public class Program17 {
	    public static String reverseStringWords(String input) {
 	        if (!input.contains(" ")) {
	            return input;
	        } else {
	            String[] arr = input.split(" ");
	            String newarr = arr[arr.length - 1];
	            String[] remainingWords = new String[arr.length - 1];
	            System.arraycopy(arr, 0, remainingWords, 0, arr.length - 1);
	            String remainingString = String.join(" ", remainingWords);
	            String reversedRemainingString = reverseStringWords(remainingString);
	            return newarr + " " + reversedRemainingString;
	    }
	    }
	    public static void main(String[] args) {
	        String inputString = "one two three";
 	        System.out.println(reverseStringWords(inputString));
	    }
	}
