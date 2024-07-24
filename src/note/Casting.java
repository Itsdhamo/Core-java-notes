package note;
class A{
	int x=10;
	void first() {
		System.out.println("i am the first...");
	}
}
class B extends A{
	int y=20;
	void second() {
		System.out.println("i am the second...");
	}}
class C extends B{
	int z=30;
	void third() {
		System.out.println("i am the third...");
	}}
public class Casting {
	public static void main(String[] args) {
        C c1 =new C();
     B b1 =c1;// implicit upcasting
     A a1=(B)b1;// explicit upcasting
     System.out.println(b1.x);
     System.out.println(a1.x);
     System.out.println(b1.y);
     B b11=(B)a1;// explicit downcasting
     System.out.println(b11.y);
b11.first();	
b11.second();
C c11=(C)b11;// explicit downcasting
System.out.println(c11.x);
System.out.println(c11.y);
System.out.println(c11.z);
c11.first();
c11.second();
c11.third();
	}}
