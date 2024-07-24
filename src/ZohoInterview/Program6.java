package ZohoInterview;
import java.util.*;
public class Program6 {
	public static void main(String[] args) {
		int occurrence = 0;

		Map m = new HashMap();
		List nos = new LinkedList();
		nos.add(1);
		nos.add(1);   
		nos.add(2);  
		nos.add(3);
		nos.add(4);
		nos.add(3);
		nos.add(2);
		nos.add(1);
		nos.add(4);
		nos.add(5);
		nos.add(100);

		Set uniqueNos = new HashSet(nos);

		for(Object temp:uniqueNos) {
		for(Object tempList:nos) {
		if(temp == tempList) {
		occurrence++;
		}
		}
		m.put(temp, "Appears "+occurrence +" times");
		occurrence = 0;
		}
		System.out.println(m);
		}
}