package extra;
import java.util.Arrays;
public class MainClass5 {
public static void main(String[] args) {
	String s1="java";
	int count=0;
	char [] arr=s1.toCharArray();
 	for(int i=0;i<arr.length;i++) {
 		for(int j=0;j<arr.length;j++) {
 		if(arr[i]==arr[j]) {
 		System.out.println("duplicated value = "+arr[j]);
 		}
 		}
 		}
	}
}
