package pattern;
class pattern {
	public static synchronized void pattern() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==3 || i==5 || i==2&&j==1 || i==4&&j==5)
				System.out.print("* ");
				else 
					System.out.print("  ");}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5 || j==1 || j==5 || i==4&&j==4|| i==3&&j==3 )
				System.out.print("* ");
				else 
					System.out.print("  ");}
			System.out.println();
	}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(  j==1 || i==5 )
				System.out.print("* ");
				else 
					System.out.print("  ");}
			System.out.println();
	}
		System.out.println("-----------------");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}}}
class MyThread extends Thread{
public void run() {
	pattern.pattern();
}
}
public class MainClass1{
public static void main(String[] args) {
MyThread mt1=new MyThread();
MyThread mt2=new MyThread();
MyThread mt3=new MyThread();
mt1.start();
mt2.start();
mt3.start();
}}