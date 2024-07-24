package collectiondemo;
import java.util.*;
public class MainClass6 {
public static void main(String[] args) {
  List<Integer> l1= new ArrayList();
  l1.add( 22);
  l1.add(11);
  l1.add(34);
  l1.add(45);
  l1.add(1);
  System.out.println(l1);
  l1.remove(2);
  System.out.println(l1);
  l1.add(3,  98);
  System.out.println(l1);
  System.out.println("---------------");
  for(Object o1:l1) {
	  System.out.println(o1);
  }
  System.out.println("---------------");
  ListIterator itr = l1.listIterator();
  while(itr.hasNext()) {
	 System.out.println(itr.next());
  }
  System.out.println("---------------");
while(itr.hasPrevious()) {
	System.out.println(itr.previous());
}
System.out.println("-----------------");
for(int i=0;i<l1.size();i++) {
	System.out.println("INDEX NO ="+i+" --> "+l1.get(i));
}
System.out.println("-----------------");
System.out.println(l1.get(3));
System.out.println(l1.lastIndexOf(45));
System.out.println(l1.subList(1,4));
}
}