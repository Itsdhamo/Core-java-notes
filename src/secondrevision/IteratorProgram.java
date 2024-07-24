package secondrevision;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorProgram {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Dhamo");
	al.add("Shruthi");
	al.add("kamala");
	System.out.println(al);
	
	for(String str:al) {
		System.out.println(str);
	}
	
	Iterator<String> itr=al.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
