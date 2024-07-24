package exceptionhandling;

public class MainClass5
    {
public static void main(String[] args) 
    {
	try {
		System.out.println(10/0);
	}
	catch(Exception e2) {
		System.out.println("i am in catch");
	}
    }
    }
