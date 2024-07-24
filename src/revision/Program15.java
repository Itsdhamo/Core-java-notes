package revision;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program15 {
	public static void main(String[] args) {
		String str = "camel";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
		if(arr[i]=='a' || arr[i]=='e'|| arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
			str.replace(arr[i],'e');
		}
		}
		 System.out.println(Arrays.toString(arr));
 	    }
        }