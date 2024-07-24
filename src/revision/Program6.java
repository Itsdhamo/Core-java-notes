package revision;
public class Program6 {
public static void main(String[] args) {
	Student stu1=new Student(4006,"dhamodaran",87.4);
	Student stu2=stu1.getStudentclone();
	System.out.println(stu1);
	System.out.println(stu2);
	System.gc();
}}

