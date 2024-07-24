package ZohoInterview;

import java.util.Arrays;

public class Program16 {
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,7};
		int length=arr.length;
		 int [] newarr=new int [length];
		 int startindex=0;
		 int endindex=length-1;
		 for(int i=0;i<length;i++) {
			 if(i%2==0) {
				 newarr[i]=arr[endindex--];
			 }
			 else
				 newarr[i]=arr[startindex++];
		 }
		 System.out.println(Arrays.toString(newarr));
	}
}
