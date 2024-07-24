package collection;
import java.util.*;
public class MainClass2 {
public static void main(String[] args) {
	HashMap<String,Integer> names =new HashMap<>();
	names.put("Dhamo", 95);
	names.put("Shruthi",99);
	names.put("Kamala", 98);
	names.put("Sejin",97);
	names.put("Maharaj",96);
	names.put("Savitha",95);
System.out.println(names);
System.out.println(names.containsKey("Sejin"));
System.out.println(names.get( "Shruthi"));
System.out.println(names.values());
System.out.println(names.entrySet());
 names.put("karnika",100);
 System.out.println(names);
 Set<String> name=names.keySet();
 for(String s1:name) {
	 System.out.println(name);
 }
}
}
