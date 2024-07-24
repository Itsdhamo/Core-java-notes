package maphierchery;

import java.util.*;
import java.util.Map.Entry;

public class Program2 {
	public static void main(String[] args) {
		HashMap<String, Integer> modules = new HashMap<>();
		modules.put("core java", 180);
		modules.put("SQL", 80);
		modules.put("webtech", 70);
		modules.put("J2EE", 70);
		modules.put("framework", 50);
		System.out.println(modules);
		System.out.println("-------------------");
		System.out.println(modules.containsKey("core java"));
		System.out.println("-------------------");
		modules.remove("SQL");
		System.out.println(modules);
		System.out.println("-------------------");
		Set<String> ks = modules.keySet();
		for (String module : ks) {
			System.out.println(module);
		}
		System.out.println("-------------------");
		Set<Entry<String, Integer>> es = modules.entrySet();
		for (Entry<String, Integer> entry : es) {
			System.out.println(entry.getKey());
		}
	}
}