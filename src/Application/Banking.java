package Application;
	import java.util.Random;
	import java.util.Scanner;
	public class Banking {
		static void credit(double balance,double amt) {
			balance=balance+amt;
			System.out.println("your amount is deposited");
			referenceid();
			System.out.println("Available Balance = "+balance+" rupees");
			System.out.println("---------------------");
		}
		static void debit(double balance,double amt) {
			balance=balance-amt;
			System.out.println("your amount is debited");
			referenceid();
			System.out.println("Available Balance = "+balance+" rupees");
			System.out.println("---------------------");
		}
		static void balanceenquiry(double balance) {
			System.out.println("your balance = "+balance+" rupees");
			System.out.println("---------------------");
		}
		static void changepinnumber(int newpin,int existpinno) {
			existpinno=newpin;
			System.out.println("Your pin number changed sucessfully");
			System.out.println("your new pin no is = "+newpin);
		}
		static void referenceid() {
			System.out.println("Reference id = "+ (int)(Math.random()*1000000000));
		}
	public static void main(String[] args) {
		final String bankname="BANK OF SPAIN";
		System.out.println("-----welcome to "+bankname+" -----");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Four Digit PIN no = ");
		int pinno=sc.nextInt();
		String name="Dhamodaran Rajendran";
		long accno=363183882;
		double balance=10000.0;
		int existpinno=5544;
		for(;;) {
			if(existpinno == pinno) {
			System.out.println("Welcome "+name);
			System.out.println("Account no : "+accno);
			System.out.println("Deposit = 1,Withdrawal = 2");
			System.out.println("balance enqiry = 3,Change Pin no= 4");
			System.out.println("Enter the service number = ");
			int servicenum =sc.nextInt();
			if(servicenum<5) {
			if(servicenum == 1) {
				System.out.println("Enter the deposit amt = ");
				double amt=sc.nextDouble();
				credit(balance,amt);
			}
			else if
			(servicenum == 2){
			System.out.println("Enter the withdrawal amt = ");
			double amt=sc.nextDouble();
			debit(balance,amt);
			}
			else if(servicenum == 3) {
				balanceenquiry(balance);
			}
			else if(servicenum == 4) {
				System.out.println("Enter the old pin number = ");
				int oldpin=sc.nextInt();
				if(oldpin == existpinno) {
				 System.out.println("Enter the new pin no = ");
				 int newpin=sc.nextInt();
				changepinnumber(newpin,existpinno);
			}
				else {
					System.out.println("Plz enter your old pin no correctly...");
					System.out.println("--------------------------------");
				}
		}}
			else {
				System.out.println("Plz enter valid service number");
			}
			}
		else 
		{
			System.out.println("Wrong pin number please enter valid pin number");
			break;
		}
			System.out.println("----THANK YOU----");
			System.out.println("---VISIT AGAIN---");
			}
		}
	}
