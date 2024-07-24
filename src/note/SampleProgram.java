package note;
class Qspiders{
	int javafac;
	double amt;
	String head;
	Qspiders(int javafac){
		this.javafac=javafac;
		System.out.println("we are having well experienced facaulty");
		}
	Qspiders(double amt){
		this(3);
		this.amt=amt;
		System.out.println("amount is quite bulk");
	}
	Qspiders(String head){
		this(37950.0);
		this.head=head;
		System.out.println("our institue head is nandeesh");
	}
}
class Jspiders extends Qspiders{
	String sqlfac;
	Jspiders(String sqlfac){
		super("NANDEESHA");
		this.sqlfac=sqlfac;
		System.out.println("select sqlsir from jspiders where ename=nagaraj");
	}
}
public class SampleProgram {

	public static void main(String[] args) {
		Jspiders j=new Jspiders("nagaraju");
		System.out.println(" OUR FACAULTY NAMES ARE "+j.head+" and "+j.sqlfac);
		System.out.println("NO OF JAVA FACULTY "+j.javafac);
		System.out.println("AMOUNT TO BE PAID = "+j.amt);
	}
}
