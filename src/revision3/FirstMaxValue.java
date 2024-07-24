package revision3;

public class FirstMaxValue {
	public static void main(String[] args) {
		int [] arr= {1,7,10,5,300,3,2,9,50,1000};
		int fmax=0,smax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fmax) {
				smax=fmax;
				fmax=arr[i];
			}
			else if(arr[i]<smax) {
				smax=arr[i];
			}
		}
		System.out.println("First max ==> "+fmax);
		System.out.println("Second max ==> "+smax);
	}
}
