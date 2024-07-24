package note1;
interface Organization{
	int a=10;
	void who();
	void ngo();
}
interface Groups{
	void uno();
}
class Names implements Organization,Groups{
	public void who() {
		System.out.println("WORLD HEALTH ORGANIZATION");
	}
	public void ngo() {
		System.out.println("NON GOVERNMENATAL ORGANIZATION");
	}
	public void uno() {
		System.out.println("UNITED NATION ORGANIZATION");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
	Organization o = new Names();      //upcasting done here...
	o.who();
	o.ngo();
Groups g=new Names();
g.uno();
	}
}
