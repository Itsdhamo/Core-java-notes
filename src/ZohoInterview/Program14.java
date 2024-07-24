package ZohoInterview;

import java.util.Arrays;

public class Program14 {
public static void main(String[] args) {
	int [] arr= {2,2,0,4,0,8,8};
	int length=arr.length;
	int i=0;
	while(i<length-1) {
		if(arr[i]!=0 && arr[i]==arr[i+1]) {
			arr[i]=2*arr[i];
			arr[i+1]=0;
			i++;
		}
		i++;
	}
	int zerocount=0;
	for(int num:arr) {
		if(num==0) {
			zerocount++;
		}
	}
	int [] newarr=new int[length];
	int idx=0;
	for(int num:arr) {
		if(num!=0) {
		newarr[idx++]=num;
		}
	}
	
	while(zerocount>0) {
		newarr[idx++]=0;
		zerocount--;
	}
	System.out.println(Arrays.toString(newarr));
}
}
