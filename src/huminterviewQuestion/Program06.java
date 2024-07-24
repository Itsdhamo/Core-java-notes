package huminterviewQuestion;

public class Program06 {
public static void main(String[] args) {
	int [] arr= {6,9,14,60,22,4,90};
	int firstmax=Integer.MIN_VALUE;
	int secondmax=Integer.MIN_VALUE;
	int thirdmax=Integer.MIN_VALUE;
	
	for(int num:arr) {
		if(num>firstmax) {
			thirdmax=secondmax;
			secondmax=firstmax;
			firstmax=num;
		}
		else if(num>secondmax && firstmax!=num) {
			thirdmax=secondmax;
			secondmax=num;
		}
		else if(num>thirdmax && secondmax!=num && firstmax!=num) {
			thirdmax=num;
		}
	}
	System.out.println(thirdmax);
}
}
