package secondrevision;

import java.util.Iterator;
import java.util.Vector;

public class MainClass2 {
public static void main(String[] args) {
	Vector<String> vec=new Vector<String>();
    vec.add("dhamo");
    vec.add("Shruthi");
    vec.add("kamala");
    vec.add("Sejin");
    vec.add("Savitha");
    System.out.println("Before add a name...");
    Iterator<String> itr1=vec.iterator();
    while(itr1.hasNext()) {
    	System.out.println(itr1.next());
    }
    System.out.println("------------");
    boolean itr=vec.add("dhamodaran");
    System.out.println(itr);
    System.out.println("------------");
    System.out.println("After added a name...");
    System.out.println("------------");
    Iterator<String> itr2=vec.iterator();
    while(itr2.hasNext()) {
    	System.out.println(itr2.next());
    }
  }
}
