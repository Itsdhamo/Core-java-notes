package formula;
 
class calculator{
	private static calculator calci=new calculator();
	private calculator(){
		System.out.println("creating calculator object...");
	}
	public static calculator getcalci() {
		return calci;
	}
}
public class Singleton {
public static void main(String[] args) {
	//calculator c1=new getcalci();
	Object o1=new Object();
	System.out.println(o1);
}
}
