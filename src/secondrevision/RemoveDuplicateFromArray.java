package secondrevision;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
public static void main(String[] args) {
	int [] arr= {1,3,4,7,4,2,9,1,3};
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=0;j<arr.length;j++) {
			 
			if(arr[i]==arr[j]) {
				count++;
			}
			 
		}
		if(count>1) {
			 arr[i]--;
		}
	}
}
}
