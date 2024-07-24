package array;

public class MainClass2 {
public static void main(String[] args) {
	int []mani = {1,2,3,4,5};
	int sum=0,sum1=0;
	for(int i=mani.length-1;i>=0;i--) {
		if(i%2==0)
			sum=sum+mani[i];}
			System.out.println("sum ="+sum);
	
	for(int j=mani.length-1;j>=0;j--) {
		if(j%2 != 0)
			sum1=sum1+mani[j];}
			System.out.println("sum1 ="+sum1);	
			System.out.println("----------------");
			int []dhamo = {1,2,3,4,5};
			int sum2=0,sum3=0;
			for(int i=0;dhamo.length-1>=i;i++) {
				if(i%2==0)
					sum2=sum2+mani[i];}
					System.out.println("sum ="+sum);
			
			for(int j=0;dhamo.length-1>=j;j++) {
				if(j%2 != 0)
					sum3=sum3+mani[j];}
					System.out.println("sum1 ="+sum1);	
}
}
