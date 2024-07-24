package revision3;

public class Print10NumberUsingRecursion {
	public static void print(int num) {
		if(num<=10) {
	System.out.println(num);
	num++;
	print(num);
		}
		}
public static void main(String[] args) {
	int num=1;
	print(num);
}
}
