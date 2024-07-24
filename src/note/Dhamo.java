package note;

public interface Dhamo {
	void m1();
}
class dhamodaran implements Dhamo{
	public void m1() {
		System.out.println("--------");
	}
}
class time{
	public static void main(String[] args) {
		dhamodaran d=new dhamodaran();
		d.m1();
	}
}
