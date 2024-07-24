package revision;
interface Book{
	int a=10;
	void ponniyinselvan();
}
class Reader implements Book{
	public void ponniyinselvan() {
		System.out.println("it have 5 volume");
	}}
public class Program1 {
	public static void main(String[] args) {
	Book b=new Reader();
	System.out.println(b.a);
	b.ponniyinselvan();
	}}

