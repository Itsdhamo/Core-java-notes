package core_basic;
public class MainClass2 {
public static void main(String[] args) {
	Student std1=new Student(4006,"dhamodaran",90.8);
	Student std2=new Student(4007,"kamala",95.5);
	Student std3=new Student(4008,"shurthi nisha",99.9);
	System.out.println(std1.toString());
	System.out.println(std2.toString());
	System.out.println(std3.toString());
	System.out.println(std1.hashcode());
	System.out.println(std2.hashcode());
	System.out.println(std3.hashcode());
	//System.out.println(std1.equals(std1));
	
}
}
