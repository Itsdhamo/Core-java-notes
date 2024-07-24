package Application;
class train
{
String trainname;
int trainno;
String departure;
String destination;
String passengername;
long phoneno;
train(String trainname,int trainno,String departure,String destination,String passengername,long phoneno)
{
this.trainname=trainname;
this.trainno=trainno;
this.departure=departure;
this.destination=destination;
this.passengername=passengername;
this.phoneno=phoneno;
System.out.println("WELCOME TO "+trainname);
System.out.println("TRAIN NUMBER = "+trainno);
System.out.println("from "+departure+" to "+destination);
System.out.println("PASSENGER NAME = "+passengername);
System.out.println("PHONE NO = "+phoneno);
}
void ticketavail() {
System.out.println("AC = 56 seats,price=1500.0");
System.out.println("SLEEPER = 90 seats,price=500.0");
System.out.println("SITTER = 100 seats,price =200.o");
}
void ticketbook(double rupees) {

	System.out.println("YOUR BOOKING IS UNDER PROGRESS");
}
}
class AcTicket extends train{
AcTicket(String trainname,int trainno,String departure,String destination,String passengername,long phoneno)
{
	super("PANDIYAN SUPER FAST EXPRESS",56789,"MADURAI JUNCTION","MGR CENTRAL STATION","SHRUTHI NISHA",755030710 );
}
void ticketbook(double ruppes) {
     	if(ruppes==1500.0|| ruppes>1500) {
		System.out.println("YOUR BOOKING IS SUCESSFULLY");
		System.out.println("PAID AMOUNT IS "+ruppes);
        System.out.println("HAPPY JOURNEY");
        double balamt = ruppes-1500;
        System.out.println("YOUR BALANCE AMOUNT = "+balamt);
}
     	else
     	System.out.println("PLEASE ENTER CORRECT AMOUNT");
}
}
class Sleeper extends train{
Sleeper(String trainname,int trainno,String departure,String destination,String passengername,long phoneno)
{
	super( "KANYAKUMARI EXPRESS",95673,"RENGASAMUDRAM","CHENNAI EGMORE","KAMALA",995239210);
}
void ticketbook(double ruppes) {
	    if(ruppes==500.0 || ruppes>500){
		System.out.println("YOUR BOOKING IS SUCESSFULLY");
		System.out.println("PAID AMOUNT IS "+ruppes);
        System.out.println("HAPPY JOURNEY");
        double balamt = ruppes-500;
        System.out.println("YOUR BALANCE AMOUNT = "+balamt);

}
	    else
	    System.out.println("PLEASE ENTER CORRECT AMOUNT");
}
}
class Sitter extends train{
Sitter(String trainname,int trainno,String departure,String destination,String passengername,long phoneno)
{
	super( "CHOLAN SUPER FAST EXPRESS",22956,"CUDDALORE","CHENNAI EGMORE","DHAMODARAN",822052406);
}
void ticketbook(double ruppes) {
	    if(ruppes==200.0 || ruppes >200){
		System.out.println("YOUR BOOKING IS SUCESSFULLY");
		System.out.println("PAID AMOUNT IS "+ruppes);
        System.out.println("HAPPY JOURNEY");
        double balamt = ruppes-200;
        System.out.println("YOUR BALANCE AMOUNT = "+balamt);
}
	    else
	    System.out.println("PLEASE ENTER CORRECT AMOUNT");
}
}
public class TicketReservation{

public static void main(String[] args) {
AcTicket at =new AcTicket("PANDIYAN SUPER FAST EXPRESS",56789,"MADURAI JUNCTION","MGR CENTRAL STATION","SHRUTHI NISHA",755030710);
at.ticketavail();
at.ticketbook(1700);
System.out.println("---------------------------------");
Sleeper s=new Sleeper("KANYAKUMARI EXPRESS",95673,"RENGASAMUDRAM","CHENNAI EGMORE","KAMALA",995239210);
s.ticketavail();
s.ticketbook(500);
System.out.println("---------------------------------");
Sitter s1=new Sitter("CHOLAN SUPER FAST EXPRESS",22956,"CUDDALORE","CHENNAI EGMORE","DHAMODARAN",822052406);
s1.ticketavail();
s1.ticketbook(300);
}
}

