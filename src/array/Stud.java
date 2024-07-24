package array;
import java.util.Arrays;
public class Stud {
int id;
String name;
double[] marks;
public Stud(int id, String name, double[] marks) {
	this.id = id;
	this.name = name;
	this.marks = marks;
}
double totalmarks() {
	double total=0;
	for(int i=0;i<=marks.length-1;i++) {
	 total=total+marks[i];
			}
	return total;
}

double averagemark() {
	return totalmarks()/marks.length;
}

String result() {
	String res="pass";
	for(double mark:marks)
	if(mark<35.0) {
		res="fail";
	}
	return res;
}
public String toString() {
	return "[student id ="+id+" ,student name ="+name+" students marks ="+Arrays.toString(marks)+"]";
}
}
