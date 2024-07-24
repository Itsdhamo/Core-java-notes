package revision3;

public class ArrayElementsAndTheirFactors {
	public static void factors(int [] arr) {
		int [] factors=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j==0) {
					count++;
				
				}
			}
		}
		System.out.println();
	}
public static void main(String[] args) {
	int[] arr= {1,2,9,50,465,80};
}
}
