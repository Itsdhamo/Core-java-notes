package note1;
import java.util.Scanner;
public class ArmStrong {
static int fact(int dc,int rem) {
	int pow=1;
	for(int i=1;i<=dc;i++) {
		pow =pow*rem;
	   }
	return pow;
       }
	   public static void main(String[] args) 
	    {
		Scanner sc =new Scanner (System.in);
	    System.out.println("Enter the number =");
		 int num=sc.nextInt();
		 int sum=0,temp=num,a=num, dc=0;
		    while(num>0)
		 {
				 dc++;
				 a=a/10;
		 }
			while(num>0) 
			{
				int rem =num%10;
				sum = sum+fact(dc,rem);
				num=num%10;
			}	
		
          if(sum == temp)
          {
	System.out.println(temp+" is a ARMSRTONG NUMBER");
          }
          }
	      }


