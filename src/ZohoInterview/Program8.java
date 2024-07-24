package ZohoInterview;

import java.util.Arrays;

public class Program8 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
		int input =4;
		int length = arr.length;
		int newlength = length + 1;
		int[] arr1 = new int[newlength];
		for (int i = 0; i < arr.length; i++) {
			if (input == arr[i]) {
				System.out.println(i);
			} else if (input != arr[i]) {
				for (int j = 0; j < arr.length; j++) {
						arr1[j] = arr[j];
						arr1[4] = input;
				}
			}
			break;
		}
		for(int a=0;a<arr1.length;a++) {
			for(int b=0;b<arr1.length;b++) {
				if(arr1[a]<arr1[b]) {
					int temp=arr1[a];
					arr1[a]=arr1[b];
					arr1[b]=temp;
				}
			}
		}
		for(int k=0;k<arr1.length;k++) {
			if(input==arr1[k]) {
				System.out.println(k);
				break;
			}
			 
		}
		 
	}
}
