package huminterviewQuestion;

public class Program03 {
public static void main(String[] args) {
	String str="DOG";
	permute(str.toCharArray(), 0, str.length()-1);
}
public static void permute(char[] arr,int startindex,int endindex) {
	if(startindex==endindex) {
		System.out.println(String.valueOf(arr));
	}
	else {
		for(int i=startindex;i<=endindex;i++) {
			swap(arr,startindex,i);
			permute(arr, startindex+1, endindex);
			swap(arr,startindex,i);
		}
	}
}
public static void swap(char[] arr,int i,int j) {
	char temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
