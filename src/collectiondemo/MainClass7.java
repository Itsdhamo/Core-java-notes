package collectiondemo;
import java.util.*;
public class MainClass7 {
public static void main(String[] args) {
	List<Integer> l1=new ArrayList<Integer>();
	l1.add(9);
	l1.add(3);
	l1.add(5);
	l1.add(1);
	l1.add(2);
	l1.add(7);
	int fmax=0,smax=0;
	for(int i=0;i<l1.size();i++) {
		if(l1.get(i)>fmax) {
			smax=fmax;
		System.out.println(fmax=l1.get(i));
		}
	}
	
}
}
