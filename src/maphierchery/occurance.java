package maphierchery;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class occurance {
public static void main(String[] args) {
	Map<Integer,Integer> mapcount=new HashMap();
	List<Integer> li=new LinkedList<Integer>();
	li.add(1);
	li.add(2);
	li.add(1);
	li.add(4);
	li.add(100);
	li.add(6);
	li.add(5);
	li.add(6);
	li.add(2);;
	li.add(100);
	Set<Integer> setitems=new HashSet<Integer>(li);
	int occurance=0;
	for(int num:setitems) {
		for(int num1:li) {
			if(num==num1) {
				occurance++;
			}
		}
		mapcount.put(num,occurance);
		occurance=0;
	}
	System.out.println(mapcount);
}
}
