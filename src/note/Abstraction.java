package note;
abstract class Cat{
	abstract void tom(boolean s,char c);
	abstract void tim(String r);
}
class Jerry extends Cat{
	void tom(boolean s,char c) {
	System.out.println("tom and jerry are friends = "+s);	
	System.out.println("The first letter of Tom is "+c);
	}
	void tim(String c) {
		System.out.println("the mice name is "+c);
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Jerry j= new Jerry ();
		j.tom(false, 'T');
		j.tim("JERRY");

	}

}
