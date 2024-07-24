package collectiondemo;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class MainClass4 {
public static void main(String[] args){
	Collection<String> c1=new ArrayList<String>();
	c1.add("dinga");
	c1.add("dingi");
	c1.add("shella");
	Iterator<String> itr=c1.iterator();
	while(itr.hasNext())
	    {
		Object o1=itr.next();
		System.out.println(o1);
		}
	}
}