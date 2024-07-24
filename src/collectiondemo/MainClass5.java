package collectiondemo;
import java.util .*;
public class MainClass5 {
  
	public static void main(String[] args) {
	 List<String> l1=new ArrayList<String>(Arrays.asList("dhamo","kumar","sasi")) ;
	 // for loop
	 for (Object o1:l1) {
		 System.out.println(o1);
	 }
	 System.out.println("------------------");
		// Iterator
Iterator<String> itr =l1.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
System.out.println("-------------------");
for(Iterator i2=l1.iterator();i2.hasNext();) {
	System.out.println(i2.next());
}
//----------------
System.out.println(l1);
System.out.println("-------------------");
ListIterator<String> lit=l1.listIterator();
while(lit.hasNext()) {
	System.out.println(lit.next());
}
System.out.println("-----------------");
// we are not supposed to use true keyword in while condition.
while(lit.hasPrevious()) {
	System.out.println(lit.previous());
}
//using for loop
System.out.println("--------using for loop--------");
for( int i=0;i<l1.size();i++) {
	System.out.println(l1.get(i));
}
System.out.println("--------reverse order------------");
for(int i=l1.size()-1;i>=0;i--) {
	System.out.println(l1.get(i));	
}
}}
