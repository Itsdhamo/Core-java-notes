package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class students {
	int id;
	String name, location;

	public students(int id,String name,String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+location;
	}}

	class sortbyid implements Comparator<students> {
		@Override
		public int compare(students s1, students s2) {
			return s1.id - s2.id;
		}
	}

	class sortbyname implements Comparator<students> {
		@Override
		public int compare(students s1, students s2) {
			// TODO Auto-generated method stub
			return s1.name.compareTo(s2.name);
		}
	}
public class MainClass13 {
	public static void main(String[] args) {
		
		List<students> li=new ArrayList<students>();
		li.add(new students(1,"Dhamo","cuddalore"));
		li.add(new students(2,"Shruthi","madurai"));
		li.add(new students(3,"Kamala","kovilpatti"))  ;
		System.out.println("unsorted lists");
		//unsorted order
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		System.out.println("sorted lists based on id");
		// sorted based on id
		Collections.sort(li,new sortbyid());
        for(int j=0;j<li.size();j++) {
        	System.out.println(li.get(j));
        }
        System.out.println("sorted based on name");
        Collections.sort(li,new sortbyname());
        for(int k=0;k<li.size();k++) {
        	System.out.println(li.get(k));
        }
	}

}
