package secondrevision;
class tenthstandard{
	int nos=35;
	String teachername="bhuvaneshwari";
}
class twelthstandard{
	int nos=47;
	String teachername="parvathi";
}
class School{
	static tenthstandard ts=new tenthstandard();
	twelthstandard ts1=new twelthstandard();
}
public class Composition {
public static void main(String[] args) {
	School sch=new School();
	System.out.println(School.ts.nos);
	System.out.println(School.ts.teachername);
	System.out.println(sch.ts1.nos);
	System.out.println(sch.ts1.teachername);
}
}
