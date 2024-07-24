package collection;

import java.util.HashMap;

public class MainClass4 {
public static void main(String[] args) {
	HashMap<String, Integer> name=new HashMap<>();
	name.put("dhamodaran", 23);
	name.put( "dharanidaran", 23);
	name.put( "gokul", 22);
	System.out.println(name);
	System.out.println(name.containsValue( 23));
	System.out.println(name.containsKey("dhamodaran"));
	System.out.println(name.isEmpty());
	System.out.println(name.remove( "gokul",22));
	System.out.println(name);
	System.out.println(name.size());
}
}
