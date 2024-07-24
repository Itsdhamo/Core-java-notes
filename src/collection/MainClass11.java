package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainClass11 {
public static void main(String[] args) {
	Queue<Integer> number=new PriorityQueue<>();
	number.add(10);
	number.add( 20);
	number.add( 30);
	number.add( 40);
	number.add( 50);
	System.out.println(number);
	System.out.println(number.offer(30));
	System.out.println(number);
	System.out.println(number.peek());
	System.out.println(number);
	System.out.println(number.poll());
	System.out.println(number);
	for(Object o1:number) {
		System.out.println(o1);
	}
}
}
