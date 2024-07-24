package note;
class Laptop{
	void uses(int a) {
		System.out.println("it is used for doing some software work");
	}
}
class Computer extends Laptop{
	void uses(int a) {
		System.out.println("it is used to learn JAVA");
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		Laptop l =new Computer();
		l.uses(1);

	}

}
