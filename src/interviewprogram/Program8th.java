package interviewprogram;

public class Program8th {
public int index=1;
}
class App extends Program8th{
	public App(int index) {
		index=index;
	}
	public static void main(String[] args) {
		App myapp=new App(10);
		System.out.println(myapp.index);
	}
}
