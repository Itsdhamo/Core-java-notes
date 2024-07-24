package collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class MainClass3 {
public static void main(String[] args) {
	String str="programmer";
	LinkedHashMap<Character, Integer>fq=new LinkedHashMap<>();
	for(char ch:str.toCharArray()) {
		if(fq.containsKey(ch)) {
			fq.put( ch,fq.get(ch)+1);
		}
		else {
			fq.put(ch,1);
		}}
	System.out.println(fq);
	for(Entry<Character, Integer>entry:fq.entrySet()) {
		System.out.println(entry);
	}
}
}
