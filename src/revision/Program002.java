package revision;

public class Program002 {
	public static void print(String str,int num) {
		for(int i=1;i<=num;i++) {
			System.out.print(str);
		}
	}
public static void main(String[] args) {
	String name="2[ANNA]4[TANGAI]";
	int num=0;
	char[] arr=name.toCharArray();
	for(int i=0;i<arr.length;i++) {
		StringBuilder stb2=new StringBuilder();
		while(arr[i]<='9' && arr[i]>='0') {
			stb2.append(arr[i++]);
		}
		StringBuilder stb1=new StringBuilder();
		while(arr[i]<='Z' && arr[i]>='A') {
			stb1.append(arr[i++]);
		}
		 
		String s1=stb1.toString();
		String s2=stb2.toString();
		for(int j=0;j<s1.length();j++) {
			num=s1.charAt(j)-48;
		}
		print(s1, num);
	}
}
}
