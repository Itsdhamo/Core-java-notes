package collectiondemo;
import java.util.*;
import core_basic.Student;
public class MainClass10 {
public static void main(String[] args) {
	Set<Integer> s1=new TreeSet();
	s1.add(10);
	s1.add(8);
	s1.add(12);
	s1.add(3);
	s1.add(6);
	System.out.println(s1);
	Set<String> s2=new TreeSet();
	s2.add("dhamo");
	s2.add("shruthi nisha");
	s2.add("kamala");
	s2.add("sejin");
	s2.add("savitha");
	s2.add("maharaja");
  System.out.println(s2);
  Set<Student> s3=new TreeSet();
  s3.add(new Student(4006,"dhamodaran",95.0));
  s3.add(new Student(4007,"shruthi nisha",99.0));
  s3.add(new Student(4008,"kamala",100.0));
  s3.add(new Student(4009,"savitha",99.0));
  s3.add(new Student(4010,"sejin",100.0));
  s3.add(new Student(4011,"maharaja",99.0));
  for(Object o1:s3) {
	  System.out.println(o1);
  }
}
}
