package exceptionhandling;
class IncorrectLengthException extends Exception{
	public void gaveexplain() {
		System.out.println("please enter valid length of String data...");
	}
}
public class UserDefinedException {
public static void main(String[] args) {
	checked("dhamodaranaa");
	
}
private static void checked(String name) {
	int length=name.length();
	 		try {
	 			checking(length);
	 		}
	 		catch (IncorrectLengthException e) {
	 			e.printStackTrace();
	 			e.gaveexplain();
			}}
private static void checking(int length) throws IncorrectLengthException{
	if(length<10) {
		System.out.println("length of the String data is = "+length);
	}
	else {
		throw new IncorrectLengthException();
	}
}
}

