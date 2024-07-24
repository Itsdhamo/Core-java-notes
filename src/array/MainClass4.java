package array;
class Student{
	String name;
	Student(String name){
		this.name=name;
	}
	public String toString() {
		return name ;
	}
}
public class MainClass4 {
public static void main(String[] args) {
  	Student s1=new Student("dhamo");
  	System.out.println(s1);
  	System.out.println(s1.hashCode());
}
}