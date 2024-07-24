package collection;
class Sample{
	private int age;
	private String name;
	public Sample() {
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
}
public class MainClass9 {
	public static void main(String[] args) {
	Sample s1=new Sample();
     s1.setage(23);
     s1.setname("dhamodaran");
     System.out.println(s1.getage());
     System.out.println(s1.getname());
	}
}
