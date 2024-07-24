package collectiondemo;
import java.util.Collection;
import java.util.LinkedList;
public class MainClass2 {
public static void main(String[] args) {
	Collection vampiredaries=new LinkedList();
	vampiredaries.add("Damon Salvatore");
	vampiredaries.add("Stefan Salvatore");
	vampiredaries.add("Elena Gilbert");
	vampiredaries.add("Bonnie bennet");
	vampiredaries.add("Rebecca Chandler");
	for(Object o1:vampiredaries) {
		String name=(String)o1;
		System.out.println(name +"\t"+name.charAt(0)+"\t"+name.length());
	}
}
}
