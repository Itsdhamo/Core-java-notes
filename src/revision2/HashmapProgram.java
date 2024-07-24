package revision2;

import java.util.HashMap;

public class HashmapProgram {
	public static HashMap<String,Integer> check(String str){
		int uppercount=0,lowercount=0,numcount=0,specialcount=0;
		for(char ch:str.toCharArray()) {
			if(ch>='a' && ch<='z') {
				lowercount++;
			}
			else if(ch>='A' && ch<='Z') {
				uppercount++;
			}
			else if(ch>='1' && ch<='9') {
				numcount++;
			}
			else
				specialcount++;
		}
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("upper character count",uppercount);
		hm.put("lower character count",lowercount);
		hm.put("number count",numcount);
		hm.put("Special character count",specialcount);
		
		return hm;
	}
public static void main(String[] args) {
	 String emailid="Dhamodaran369@gmail.com";
	 HashMap<String,Integer> hm=check(emailid);
	 System.out.println(hm);
}
}
