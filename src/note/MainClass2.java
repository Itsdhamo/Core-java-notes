package note;
class L1{
	void travel(){
		System.out.println("I AM TRAVELLING TO SUN...");
	}
}
class Adithya extends L1{
	void travel() {
		System.out.println("I AM STILL TRAVELLING WITH EARTH GRAVITY IN ORBIT...");
	}
}
class Pslv extends Adithya{
	void travel() {
		System.out.println("OUR ROCKET NAME IS PSLV ADITHYA-L1...");
	}
}
public class MainClass2 {
public static void main(String[] args) {
	L1 l=new Pslv();
	l.travel();
	L1 l1=new Adithya();
	l1.travel();
	L1 l11=new L1();
	l11.travel();
	System.out.println(true);
	System.out.println(false);
}
}
