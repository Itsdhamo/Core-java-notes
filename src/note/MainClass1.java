package note;
class Jamican{
	void  jamai(A a1) {
		if(a1 instanceof C) {
					C c1=(C)a1;
					System.out.println(c1.x);
					System.out.println(c1.y);
					System.out.println(c1.z);
		}
		else if (a1 instanceof B) {
			B b1=(B)a1;
			System.out.println(b1.x);
			System.out.println(b1.y);
			
		}
		else
			System.out.println(a1.x);
			
	}
}
   
public class MainClass1 {
	public static void main(String[] args) {
   Jamican j=new Jamican();
	j.jamai(new C());
	j.jamai( new B());
	j.jamai( new A());
	
	}
}
