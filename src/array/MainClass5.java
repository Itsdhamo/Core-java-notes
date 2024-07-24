package array;
import java.util.Scanner;
public class MainClass5 {
public static void main(String[] args) {
	Stud s1=new Stud(4006,"dhamo",new double [] {100.0,90.0,95.0});
	System.out.println(s1);
	System.out.println("Total marks = "+s1.totalmarks());
	System.out.println("Average marks = "+s1.averagemark()+" %");
	System.out.println("Result = "+s1.result());
	System.out.println("------------------------");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the id = ");
	int id=sc.nextInt();
	System.out.println("Enter the name = ");
	String name=sc.next();
	double [] marks =new double[3];
	for(int i=0;marks.length>i;i++) {
	System.out.println("Enter the"+i+1+" marks");
	marks[i]=sc.nextDouble();}
	Stud s2=new Stud (id,name,marks);
	System.out.println(s2);
	System.out.println("Student totalmark = "+s2.totalmarks());
	System.out.println("Student averagemark = "+s2.averagemark());
	System.out.println("Student result = "+s2.result());
}
}
