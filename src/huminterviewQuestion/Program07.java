package huminterviewQuestion;

public class Program07 {
public static void main(String[] args) {
	int [] arr= {2,4,3,5,0,9,-2};
	int num=7;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			int sum=arr[i]+arr[j];
			if(sum==num) {
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}
}
}
