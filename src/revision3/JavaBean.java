package revision3;

public class JavaBean {
	private String name;
	private int age;
	private double salary;
	public JavaBean() {}
	public void setname(String name) {
		this.name=name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public double getsalary() {
		return salary;
	}
public static void main(String[] args) {
	JavaBean jb=new JavaBean();
	jb.setage(22);
	jb.setname("Dhamodaran");
	jb.setsalary(30000.0);
	
	jb.setage(21);
	jb.setname("Kamala");
	jb.setsalary(50000.0);
	
	System.out.println(jb.getage());
	System.out.println(jb.getname());
	System.out.println(jb.getsalary());
}
}
