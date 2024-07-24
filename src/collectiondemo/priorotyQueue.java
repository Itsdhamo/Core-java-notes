package collectiondemo;
import java.util.*;
public class priorotyQueue {
public static void main(String[] args) {
	Queue <Integer> pq=new PriorityQueue<>();
	pq.add(7);
	pq.add(8);
	pq.add(1);
	pq.add(4);
	pq.add(9);
	pq.add(3);
System.out.println(pq);
System.out.println(pq.peek());
System.out.println(pq.poll());
Object o1=pq.poll();
while(o1 != null) {
System.out.println(o1);
o1=pq.poll();
}}
}
