package maphierchery;

import java.util.*;
import java.util.Map.Entry;

public class Program1 {
	public static void main(String[] args) {
		String str = "dhamodaran";
		LinkedHashMap<Character, Integer> fq = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			if (fq.containsKey(ch)) {
				fq.put(ch, fq.get(ch) + 1);
			} else {
				fq.put(ch, 1);
			}
		}
		System.out.println(fq);
		for (Entry<Character, Integer> entry : fq.entrySet()) {
			{
			System.out.println(entry);}
		}
	}
}