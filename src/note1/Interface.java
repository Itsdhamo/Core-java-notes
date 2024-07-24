package note1;
interface Atlee{
	int a=10;
	void rajarani();
	static void theri() {
		System.out.println("vijay and samantha");
	}
	default void mersal() {
		System.out.println("vijay and nithya menon");
	}}
interface Nelson {
	int y=20;
	void jailer();
	void doctor();
}
class Shankar{
	void indian() {
		System.out.println("INDIAN in 1999");
	}}
class Lokesh extends Shankar implements Atlee,Nelson{
	public void rajarani() {
		System.out.println("arya and nazriya");
	}
	public void jailer() {
		System.out.println("Superstar and mohanlal and shiva rajkumar");
	}
	public void doctor() {
		System.out.println("shivakartikeyan and priyanka mohan");
	}
	void indian() {
		System.out.println("INIDAN II IN 2023");
	}
	void master(){
		System.out.println("vijay and vijay sethupathi");
	}}
public class Interface {
	public static void main(String[] args) {
	Lokesh l = new Lokesh();
	System.out.println(l.a);
System.out.println(l.y);
	Atlee.theri();
	l.rajarani();
	l.mersal();
	l.jailer();
	l.doctor();
	l.master();
	l.indian();
	System.out.println("Future director name is MR DHAMODARAN B.E");
	}}
