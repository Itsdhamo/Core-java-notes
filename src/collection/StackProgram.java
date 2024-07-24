package collection;
import java.util.Iterator;
import java.util.Stack;
public class StackProgram {
	public static void main(String[] args) {
	Stack<Integer> s1 = new Stack<>();
	// create or push operation on stack
	s1.push(9);
	s1.push(1);
	s1.push(7);
	System.out.println(s1);
	// delete or pop operation on stack

	//s1.pop();
	//System.out.println(s1);
	// peek operation on stack
	System.out.println(s1.peek());
	//s1.pop();
	//s1.pop();
	boolean status = s1.empty();
	System.out.println(status);
	int indexfound = s1.search(9);
	System.out.println(indexfound);
	// how to iterate over a stack
	Iterator it = s1.iterator();
	while(it.hasNext()) {
		Object s2=it.next();
		System.out.print(s2);		
	}
	System.out.println();
	System.out.println(s1.size());
	s1.sort(null);
	System.out.println(s1);
}
}