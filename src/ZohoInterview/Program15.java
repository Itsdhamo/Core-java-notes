package ZohoInterview;

public class Program15 {
public static void main(String[] args) {
	int [] arr= {1,2,4,3,5,6};
	int sum=5;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]+arr[j]==sum) {
				if(arr[i]!=arr[j])
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}
}
}
