package revision;
import java.util.Random;
public class Program2 {
	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10.5));
		System.out.println(Math.addExact(10, 20));
		System.out.println(Math.round(10.5));
	//for(int i=1;i<=100;i++) {
		//System.out.println( generateOTP());
	//	}
	Program2 p=new Program2();
	//p.makeOTP();
	p.madeOTP();
	}
	// 1st method to generate OTp
/*static String generateOTP() {
	String otp=" ";
	otp= otp+(int)(Math.random()*10)+(int)(Math.random()*10)+(int)(Math.random()*10)+(int)(Math.random()*10);
return otp;
}*/
	// 2 st method to generate the OTP
 void makeOTP() { 
	 int otp;
	for(int i=1;i<=100;i++) {
		for(int j=1;j<=4;j++) {
		 otp =(int)(Math.random()*10);
		System.out.print(otp);
	}
		System.out.println();}}
 // 3nd method to generate OTP
	void madeOTP() {
			for(int k=1;k<=100;k++) {
				int otp,n=1;
		while (n<=4) {
			otp =(int)(Math.random()*10);
			System.out.print(otp);
			n++;
		}
		System.out.println();
	}}
	
}

