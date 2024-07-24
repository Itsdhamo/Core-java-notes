package interface_demo;
interface mani{
	void name();
}
class manonmani implements mani{
	public void name() {
		System.out.println("manigandan");
	}
}
public class dhamo {
	public static void main(String[] args) {
manonmani m=new manonmani();
m.name();
}}
