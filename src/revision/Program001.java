package revision;

public class Program001 {
	public static void print(int num, String str2)
	{
		for (int i = 1; i <= num; i++) {
			System.out.print(str2);
		}
	}
public static void main(String[] args) {
	int num=0;
	String str="2[ABC]4[DEF]";
	char[] arr=str.toCharArray();
	for(int i=0;i<arr.length;i++) {
		StringBuilder stb=new StringBuilder();
		while(arr[i]<='9' && arr[i]>='0') 
		{
			stb.append(arr[i++]);
		}
		StringBuilder stb2=new StringBuilder();
		while(arr[i]<='Z' && arr[i]>='A') {
			 stb2.append(arr[i++]);
		}
		String s1=stb.toString();
		String s2=stb2.toString();
		
		for(int j=0;j<s1.length();j++)
		{
			num=s1.charAt(j)-48;
		}
		print(num, s2);
	}
}
}
