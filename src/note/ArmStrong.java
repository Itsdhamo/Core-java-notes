package note;
public class ArmStrong   {
static int pow(int dc,int rem)  {
	int fact=1;
	for(int i=1;i<=dc;i++)  {
		fact=fact*rem;
	}
	return fact;
    }
	public static void main(String[] args){
	for(int i=1;i<=1000;i++){
		int num=i,a=num,sum=0,dc=0,temp=num;
		while(num>0){
			 dc++;
		num=num/10;
		 
	}
		while(a>0){
			int rem =a%10;
			sum=sum+pow(dc,rem);
			a=a/10;
	}
		if(temp==sum) {
			System.out.println(sum+" is a ARMSTRONG Number");
	}
	}
	}
    }
