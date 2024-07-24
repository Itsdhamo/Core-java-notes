package collectiondemo;
import java.util.Collection;
import java.util.Vector;
public class MainClass3 {
public static void main(String[] args) {
	Collection<String> vikings=new Vector<String>();
	System.out.println("ITS A GENERICS COLLECTION");
	vikings.add( "Ragno Lothbrek");
	vikings.add( "Lagertha");
	vikings.add("Rollo Lothbrek");
	vikings.add( "Bjorn Lothbrek");
	vikings.add( "Athelstan");
	vikings.add( "Floki");
	for(String name:vikings) {
		System.out.println(name+"\t"+name.charAt(1)+"\t"+name.length());
	}
}
}
