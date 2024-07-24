package threads;
class Leo{
	public synchronized static void tamilpadam() {
		String str="BADASS FREAKING LEODASS IS A BADASS";
		for(int i=0;i<str.length();i++){
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
class LCU extends Thread{
public void run() {
	Leo.tamilpadam();
}}
public class MainClass5 {
public static void main(String[] args){
	LCU l1=new LCU();
	LCU l2=new LCU();
	LCU l3=new LCU();
l1.start();
l2.start();
l3.start();
}
}
