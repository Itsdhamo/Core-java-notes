package threads;
class Greeting{
	public synchronized static void greet() {
		String s1="good morning";
		for (int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}}
		System.out.println();
	}
}
class greet extends Thread{
	public void run() {
		Greeting.greet();
	}
}
public class MainClass4 {
public static void main(String[] args) {
	greet g1=new greet();
	greet g2=new greet();
	greet g3=new greet();
	g1.start();
	g2.start();
	g3.start();
}
}
