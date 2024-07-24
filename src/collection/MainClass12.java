package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass12 {
public static void main(String[] args) {
	List li=new ArrayList();
	li.add(2);
	li.add( "dhamo");
	li.add( 'f');
	System.out.println(li);
	for(Object o1:li) {
		System.out.println(o1);
	}
	Iterator itr =li.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()
				);
	}
}
}
