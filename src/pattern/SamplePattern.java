package pattern;

public class SamplePattern {
public static void main(String[] args) {
	int k=1;
	for(int i=0;i<4;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
	}
	
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			if(i==1 || i==4 || j==1 || j==4) {
				System.out.print("* ");}
				else {
					System.out.print("  ");
			}
			
		}
		System.out.println();
	}
}
}
