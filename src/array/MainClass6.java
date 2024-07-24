package array;

public class MainClass6 {
public static void main(String[] args) {
	String name="shruthi";
	char []arr=name.toCharArray();
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(i==j || i+j==arr.length-1) 
			System.out.print(arr[i]+" ");
			else 
				System.out.print("  ");}
		System.out.println();
		
		}
	}
}

