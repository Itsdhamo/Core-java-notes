package revision;

public class Student implements Cloneable{
	int id;
	String name;
	double perc;
	public Student(int id, String name, double perc) {
		super();
		this.id = id;
		this.name = name;
		this.perc = perc;
	}
     public String toString() {
    	 return "sid= "+id+",sname = "+name+",studperc = "+perc;
     }
	public Student getStudentclone() {
		Student ref=null;
	try {
			ref=(Student)this.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();}
		 return ref;
	}
	public void finalize() {
		System.out.println("I AM IN FINALIZE");
	}

}
