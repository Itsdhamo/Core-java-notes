package secondrevision;

public class oddandevenprogram {
public static void main(String[] args) {
	int [] arr= {2,7,9,14,10,5};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.print(arr[i]+" ");
		} 
	}
	for(int j=0;j<arr.length;j++) {
		if(arr[j]%2 !=0) {
			System.out.print(arr[j]+" ");
		}
	}
}
}
