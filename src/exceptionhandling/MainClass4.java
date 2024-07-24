package exceptionhandling;

public class MainClass4 {
public static void main(String[] args) {
	int num1=10;
	int num2=0;
	int num3=0;
	try {
		num3=num1/num2;
	}
	catch(Exception e1) {
		num3=num1/2;
	}
	finally {
		System.out.println("i am in finnaly");
		System.out.println("num1 value = "+num1);
		System.out.println("num2 value = "+num2);
		System.out.println("num3 value = "+num3);
	}
}
}