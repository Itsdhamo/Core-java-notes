package Revision4;

class Students{
	int noc=60;
	void behavior() {
		System.out.println("all are good students...");
	}
}
class Boys extends Students{
	int noc1=30;
	void behavior1() {
		System.out.println("they are all quite playful guys...");
	}
}
public class Inheritance {
public static void main(String[] args) {
	Boys b1=new Boys();
	b1.behavior1();
	System.out.println(b1.noc);
	b1.behavior();
	System.out.println(b1.noc1);
}
}
