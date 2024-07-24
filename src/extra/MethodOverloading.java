package extra;
public class MethodOverloading {
	public int mankatha(int year){
		return year;
	}
	public void mankatha(String actorname) {
		System.out.println("the actor of mankatha is "+actorname);
	}
	public  void mankatha(double ticketamt) {
		System.out.println("tickets price is "+ticketamt);
	}
public static void main(String[] args) {
	MethodOverloading mo=new MethodOverloading();
	System.out.println(mo.mankatha(2011));
	mo.mankatha(100.0);
	mo.mankatha("ajith");
}
}
