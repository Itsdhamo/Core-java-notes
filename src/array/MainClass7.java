package array;

public class MainClass7 {
public static void main(String[] args) {
	int [][]arr= {{1,2,3},{5,6,7},{8,9,10}};
	System.out.println(arr.length);
	System.out.println(arr[1].length);
	int [][]mani= {{1,2,3,4,5},{1,2,3},{1,2,3,4,5,6,7}};
	for(int i=0;i<mani.length;i++) {
		for(int j=0;j<mani[i].length;j++) {
			System.out.print(mani[j]);
		}
		System.out.println();
	}
}
}
