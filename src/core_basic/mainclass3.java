package core_basic;
public class mainclass3 {
	public static void main(String[] args) {
		Student std1=new Student(123,"kamals",85.0);
		Student std2=std1.getStudentClone();
		System.out.println(std1);
		System.out.println(std2);
	//std1=null;
		//std2=null;
	System.gc();
	Class c1=std1.getClass();
	System.out.println(c1.getName());
	System.out.println(c1.getName());
	System.out.println(c1.getSimpleName());
System.out.println(c1.getModifiers());
	}
}
