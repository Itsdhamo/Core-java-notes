package ZohoInterview;

public class Program2 {
	public static String reversed(String str) {
		String [] words=str.split("\\s+");
		StringBuilder stb=new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			stb.append(words[i]);
			if(i!=0)
				stb.append(" ");
		}
		return stb.toString();
	}
public static void main(String[] args) {
	String str="I Am Richie Rich";
	System.out.println(reversed(str));
}}   