package huminterviewQuestion;

import java.util.Arrays;

public class Program05 {
public static void main(String[] args) {
	int [] arr1= {7,2,10,5,8};
	int [] arr2= {3,9,1,6,4};
	int [] arr=new int [arr1.length+arr2.length];
	for(int i=0,j=0;i<arr.length;i++) {
		if(i<arr1.length) {
			arr[i]=arr1[i];
		}
		else
			arr[i]=arr2[j++];
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[j]<arr[i]) {
				int k=arr[j];
				arr[j]=arr[i];
				arr[i]=k;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
