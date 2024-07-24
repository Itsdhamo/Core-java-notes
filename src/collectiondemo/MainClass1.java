package collectiondemo;
import java.util.Collection;
import java.util.ArrayList;
import core_basic.Student;
import java.util.Iterator;
public class MainClass1 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("otis");
		c1.add(new String("ruby"));
		c1.add(new StringBuffer("maeve"));
		c1.add(new Education());
		c1.add(new Leo());
		c1.add(new Student(4006,"dhamodaran",100.0));
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		System.out.println(c1.contains("ruby"));
		System.out.println("-----------------");
        for(Object o1:c1) {
        	System.out.println(o1);
        }
        System.out.println("-----------------");
        Iterator itr=c1.iterator();
        while(itr.hasNext()) {
      // Object o1=itr.next();
        //	System.out.println(o1);
        	System.out.println(itr.next());
        }
	}
}
