package ZohoInterview;

import java.util.Arrays;

public class Program12 {
public static void main(String[] args) {
	String str="RACE CAR";
	char[] arr=str.toCharArray();
	int startindex=0;
	int endindex=arr.length-1;
	while(startindex<endindex){
    if(!Character.isLetterOrDigit(arr[startindex])) {
    	startindex++;
    }
    else if(!Character.isLetterOrDigit(arr[endindex])) {
    	endindex--;
    }
    else {
    	char temp=arr[startindex];
    	arr[startindex]=arr[endindex];
    	arr[endindex]=temp;
    	startindex++;
    	endindex--;
    }
	}
	System.out.println(String.valueOf(arr));
}
}
