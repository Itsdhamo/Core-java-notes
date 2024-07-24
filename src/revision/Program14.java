package revision;
import java.io.File;
public class Program14 {
public static void main(String[] args) {
	File f1=new File("\\c:\\Users\\Mani\\ghost.text");
	if(f1.exists()){
		System.out.println("deleting old folder and creating new folder");
		f1.delete();
		f1.mkdir();
	}
	else
		System.out.println("creating new folder");
}
}
