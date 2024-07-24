package revision;
import java.util.Arrays;
public class Program12 {
	public static void main(String[] args) {
int[] arr= {6,3,8,2,9,1};
Arrays.sort(arr);
System.out.println("SORTING THE ARRAY AND FIND FIRST MAXIMUM AND MINIMUM, SECOND MAXIMUM AND MINIMUM");
System.out.println("first max = "+arr[arr.length-1]);
System.out.println("second max = "+arr[arr.length-2]);
System.out.println("first min = "+arr[0]);
System.out.println("second min = "+arr[1]);
	}
}
