package array;
public class MainClass3 {
public static void main(String[] args){
	int []dhamo= {1,2,3,4,5};
	int sum=0;
	for(int x:dhamo) {
		System.out.print(x+" ");
		sum=sum+x;
	}
	System.out.println();
	System.out.println(sum);
}}