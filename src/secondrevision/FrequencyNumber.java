package secondrevision;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FrequencyNumber {
public static void main(String[] args) {
	String str="dhamodaran";
	LinkedHashMap<Character,Integer> fq=new LinkedHashMap<Character, Integer>();
	for(char ch:str.toCharArray()) {
		if(fq.containsKey(ch)) {
			fq.put(ch,fq.get(ch)+1);
		}
		else {
			fq.put(ch,1);
		}
	}
for(Entry<Character,Integer> entry:fq.entrySet()) {
	System.out.println(entry.getKey()+" "+entry.getValue()+" "+entry);
}
}
}
