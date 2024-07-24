package collection;
class Car{
	Car c1=new Car();
	private Car() {	
	}
	public static void drive() {
		System.out.println("use for driving and travelling");
	}
}
public class MainClass10 {
public static void main(String[] args) {
	Car.drive();
}
}
