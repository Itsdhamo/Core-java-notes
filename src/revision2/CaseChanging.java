package revision2;

public class CaseChanging {
	public static String isconvert(String str) {
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]>='A' && arr[i]<'Z') {
				arr[i]=(char) (arr[i]+32);
			}
			else if(arr[i]>='a' && arr[i]<'z') {
				arr[i]=(char) (arr[i]-32);
			}
		}
		return String.valueOf(arr);
	}
public static void main(String[] args) {
	String name="DhamoDaran";
	System.out.println(isconvert(name));
}
}