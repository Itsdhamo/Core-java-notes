package revision2;
import java.util.ArrayList;
import java.util.Collections;
class student implements Comparable<student>{
int id;
String name;
int age;
 student(int id, String name, int age) { 
	this.id = id;
	this.name = name;
	this.age = age;
}
	@Override
	public int compareTo(student o) {
		 if(age==o.age)
		return 0;
		 else if(age<o.age)
		return 1;
		 else
		 return -1;
	}	
}
public class comparableprogram {
public static void main(String[] args) {
	ArrayList<student> al=new ArrayList<student>();
	al.add(new student(4,"Sejin", 19));
	al.add(new student(1,"Dhamo", 23));
	al.add(new student(2,"Kamala",21));
	al.add(new student(3,"Savitha",22));
	
	Collections.sort(al);
	for (student student : al) {
		System.out.println(student.id+" "+student.name+" "+student.age);
	} 
}
}
