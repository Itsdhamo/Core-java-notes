package core_basic;

public class Student {
 	int studId;
	String studName;
	double studPerc;
	public Student(int studId, String studName, double studPerc) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studPerc = studPerc;
	}
	public String toString() {
		return "student ID ="+studId+" ,student name ="+studName+" ,student percentage ="+studPerc;
	}
	public int hashcode(){
		return studId;
	}
	public boolean equals(Object o1) {
		 {
			return true;
		}
	}
	public Student getStudentClone()
	{
		Student ref=null;
		try
		{
			ref=(Student)this.clone();
		}catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return ref;
	}
	public void finalize() {
		System.out.println("I AM IN FINALIZE");
	}
}
