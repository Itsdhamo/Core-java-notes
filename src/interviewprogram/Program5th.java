package interviewprogram;

public class Program5th {
	public static void Stringreplace(String text) { 
		text=text.replace('j','c');
	}
	public static void BufferReplace(StringBuffer text) {
		text=text.append("c");
	}
public static void main(String[] args) {
	String textString =new String("java");
	StringBuffer textBuffer=new StringBuffer("java");
    Stringreplace(textString);
    BufferReplace(textBuffer);
    System.out.println(textString+textBuffer);
}
}
