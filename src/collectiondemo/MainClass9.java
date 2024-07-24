package collectiondemo;
import java.lang.reflect.Array;
import java.util.*;
public class MainClass9 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(8);
		l1.add(4);
		l1.add(5);
		l1.add(8);
		l1.add(2);
		l1.add(6);
		l1.add(5);
		for(int j=0;j<l1.size();j++) {
		 for(int i:l1) {
			 if(l1.get(j)==i)
		 System.out.println(i+" is a duplicated value");
		 }
		 }
	}
}
