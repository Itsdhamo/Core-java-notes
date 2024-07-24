package Application;
import java.util.*;
import java.util.List;
import java.util.Scanner;
public class LocalTrainReservation {
		public static void main(String[] args) {
			System.out.println("- - - - - - - - - - - - - - - - - - - - ");
			System.out.println("- - - WELCOME TO SOUTHERN RAILWAYS - - -");
			System.out.println("- - - - - - - - - - - - - - - - - - - - ");
			List<String> l1=new ArrayList<String>();
			l1.add("tambaram");
			l1.add("tambaram_sanatorium");
			l1.add("chrompet");
			l1.add("pallavaram");
			l1.add("tirusulam");
			l1.add("minambakkam");
			l1.add("palavanthangal");
			l1.add("st_thomas_mount");
			l1.add("guindy");
			l1.add("saidapet");
			l1.add("mambalam");	
			l1.add("kodambakkam");
			l1.add("nungambakkam");
			l1.add("chennai_chetpet");
			l1.add("chennai_egmore");
			l1.add("chennai_park");
			l1.add("chennai_fort");
			l1.add("chennai_beach");
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE SOURCE STATION = ");
			String srcstation=sc.next();
			System.out.println("ENTER THE DESTINATION STATION = ");
			String desstation=sc.next();
			int indexofsrc=l1.indexOf(srcstation),indexofdes=l1.indexOf(desstation);
			for(int i=indexofsrc;i<indexofdes;i++) {
				System.out.println(l1.get(i));
			}
	System.out.println("inbetween station = "+l1.subList(1, l1.size()-1));
	System.out.println("-----------------------------");
	System.out.println("HERE THESE STATIONS ARE IN BETWEEN TAMBARAM TO CHENNAI BEACH");
	for(Object o1:l1){
		System.out.println(o1);
	}
	System.out.println("------------------------------");
	 
	System.out.println("ENTER SOURCE STATION = ");
	String sourcestation=sc.next();
	System.out.println("ENTER THE DESTINATION STATION = ");
	String destinationstation=sc.next();
		double chargeperstation=5.0;
	int indexofsourcestation=l1.indexOf(sourcestation),indexofdestinationstation=l1.indexOf(destinationstation);
	int nos=indexofdestinationstation-indexofsourcestation;
	 	double fare=chargeperstation*nos;
		System.out.println("train fare inbetween from "+sourcestation+" to "+destinationstation +"="+fare);
		System.out.println("- - - WISH YOU HAPPY AND COMFORTABLE JOURNEY- - -");

	    }
		}