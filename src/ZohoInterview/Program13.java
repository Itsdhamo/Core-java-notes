package ZohoInterview;

public class Program13 {
public static void main(String[] args) {
	String str="I DID";
	String[] arr=str.split("\\s+");
	StringBuilder stb=new StringBuilder();
	for(int i=arr.length-1;i>=0;i--) {
		stb.append(arr[i]);
		if(i!=0) {
			stb.append(" ");
		}
	}
	System.out.println(stb.toString());
}
}
