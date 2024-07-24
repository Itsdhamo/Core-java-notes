package threads;
class Hero extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("i value ="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Demon implements Runnable{
	public void run() {
		for(int j=100;j<=10;j++) {
			System.out.println("j value ="+j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}}}
public class MainClass1{
public static void main(String[] args){
	Hero h1=new Hero();
	Hero h2=new Hero();
	h1.start();
	h2.start();
	Demon d1=new Demon();
	Demon d2=new Demon();
	Thread t1=new Thread(d1);
	Thread t2=new Thread(d2);
	t1.start();
	t2.start();
}}
