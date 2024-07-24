package interviewprogram;
class Students{
	int [] studentranks;
	String [] studentname;
	Students(int [] studentranks,String [] studentname){
		this.studentranks=studentranks;
		this.studentname=studentname;
	}
	// method to print the students rank and their name...
	public void studentandtheirranks(int[] studentranks,String []name) {
		for(int i=0;i<studentranks.length;i++) {
			System.out.println("student name = "+studentname[i]+",student rank = "+studentranks[i]);
		}
	}
	// method to find last rank of the student...
	public void highestrank(int[] studentranks,String []name) {
		int lastrank=0;
		String studentname=null;
		for(int i=0;i<studentranks.length;i++) {
			if(studentranks[i]>lastrank) {
				lastrank=studentranks[i];
				studentname=name[i];
			}
		}
		System.out.println("lastrank = "+lastrank);
		System.out.println("Studentname = "+studentname);
	}
	// method to find first rank of the student...
	public void lowestrank(int[] studentranks,String []name) {
		int firstrank=Integer.MAX_VALUE;
		String studentname=null;
		for(int i=0;i<studentranks.length;i++) {
			if(studentranks[i]<firstrank) {
				firstrank=studentranks[i];
				studentname=name[i];
			}
		}
		System.out.println("firstrank = "+firstrank);
		System.out.println("Studentname = "+studentname);
	}
}
public class IDA {
	public static void main(String[] args) {
		 int [] ranks= {5,1,2,4,3};
		 String [] name= {"dhamo","kamala","shruthi","savitha","sejin"};
		 Students str=new Students(ranks, name);
		 str.studentandtheirranks(ranks, name);
		 System.out.println("--------------");
		 str.highestrank(ranks,name);
		 System.out.println("--------------");
		 str.lowestrank(ranks, name);
	}

}
