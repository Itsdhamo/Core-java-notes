package exceptionhandling;
class Apple{
	int nos=10;
	String taste="Super Duper";
	String color="red";
}
class Orange extends Apple{
	int nos1=20;
	String taste1="Super";
	String color1="orange";
}
public class MainClass3 {
public static void main(String[] args) 
       {
	  Orange o1=new Orange();
	  Apple a1=o1;
	  Orange o2=(Orange) a1;
	 System.out.println(o2.nos1);
	 System.out.println(o2.taste1);
	 System.out.println(o2.color1);
	 try {
		 System.out.println("-------------");
	 }
	 catch(Exception e1) {
		 System.out.println("i am in catch block");		
		 System.out.println("only upacasted object can be downcasted");
	 }
	 finally {
		 System.out.println("i am in finally");
	 }
       }
       }
