package filehandling;
import java.io.File;
public class MainClass1 {
public static void main(String[] args) {
File f1=new File("C:\\dhamo.txt");
if(f1.exists()) {
	System.out.println("deleting old folder and creating new one");
	f1.delete();
	f1.mkdir();
}
else {
System.out.println("creating new folder");
f1.mkdir();
}
}}