package interface_demo;
abstract class gandan{
	abstract void name();
	void townname() {
		System.out.println("the town name is cuddalore");
	}
}
class dhamodaran extends gandan{
	void name() {
		System.out.println("the name is dhamodaran");
	}
	
}
 
public class mani1 {
public static void main(String[] args) {
	dhamodaran d=new dhamodaran();
	d.name();
	d.townname();	
}
}
