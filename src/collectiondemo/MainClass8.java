package collectiondemo;
import java.util.*;
public class MainClass8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
   List c1 = new ArrayList();
   System.out.println("ENTER THE OBJECT 1");
	String num1=sc.next();
	System.out.println("ENTER THE OBJECT 2");
	String num2=sc.next();
	System.out.println("ENTER THE OBJECT 3");
	String num3=sc.next();
	System.out.println("ENTER THE OBJECT 4");
	String num4=sc.next();
 List<String> l1=new ArrayList<String>();
 l1.add(num1);
 l1.add(num2);
 l1.add(num3);
 l1.add(num4);
 System.out.println(l1);
 System.out.println("----------------");
 for(Object o:l1) {
	 System.out.println(o);
 }
 System.out.println("----------------");

 ListIterator itr=l1.listIterator();
 while(itr.hasNext()) {
	 System.out.println(itr.next());
 }
 System.out.println("----------------");

 while(itr.hasPrevious()) {
	 System.out.println(itr.previous());
 }
}
}
