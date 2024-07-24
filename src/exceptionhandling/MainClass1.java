package exceptionhandling;

public class MainClass1 {
public static void main(String[] args) {
	int a=10,b=0,c=0;
	try {
	System.out.println(a/b);
	}
	catch(Exception e1){
  System.out.println("here i am in catch");		
	}
	finally {
		System.out.println("here i am in finally");
	}
	
}
}
