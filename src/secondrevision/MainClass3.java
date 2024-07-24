package secondrevision;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainClass3 {
public static void main(String[] args) {
	TreeSet<Integer> set=new TreeSet<Integer>();
	set.add(10);
	set.add(20);
	set.add(3);
	set.add(9);
	set.add(15);
	set.add(8);
	set.add(18);
	
	System.out.println(set);
	for(int num:set) {
		System.out.println(num);
	}
	System.out.println("Descending order...");
  Iterator<Integer> itr=set.descendingIterator();
  while ( itr.hasNext()) {
       System.out.println(itr.next());
  }
}
}
