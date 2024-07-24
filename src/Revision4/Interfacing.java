package Revision4;
interface Studentsss{
	int nos=70;
	void behavor();
}
abstract class Boyss implements Studentsss{
	int nos=30;
}
class Girls extends Boyss{
	int nos=70;
	public void behavor() {
		System.out.println("hii students is there...");
	}
}
public class Interfacing {
public static void main(String[] args) {
	Girls g=new Girls();
	       g.behavor();
}
}
