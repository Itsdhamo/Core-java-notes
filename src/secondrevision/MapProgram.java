package secondrevision;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
public static void main(String[] args) {
	Map<Integer,String> hm=new HashMap<Integer, String>();
	hm.put(2,"dhamodaran");
	hm.put(1,"Gokul");
	hm.put(3,"Dharanidaran");
  for(Map.Entry<Integer, String> entry:hm.entrySet()) {
	  System.out.println(entry.getKey()+" "+entry.getValue());
  }
}
}
