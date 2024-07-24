package array;
 final class Abinav{
private final int x;
public Abinav(int x) {
	this.x = x;
}
public int typing() {
	return x;
}
}
 // immutable class
public class MainClass9 {
    public static void main(String[] args) {
		Abinav a1=new Abinav(1);
		System.out.println( a1.typing());
	}
}
