package huminterviewQuestion;

import java.util.HashMap;

public class Program04 {
public static void main(String[] args) {
String str="dhamodaran";
HashMap<Character,Integer> charcount=new HashMap<Character, Integer>();
for(char c:str.toCharArray()) {
	charcount.put(c,charcount.getOrDefault(c,0)+1);
}
StringBuilder stb=new StringBuilder();
for(char c:str.toCharArray()) {
	if(charcount.get(c)==1)
		stb.append(c);
}
System.out.println(stb.toString());
}
}
