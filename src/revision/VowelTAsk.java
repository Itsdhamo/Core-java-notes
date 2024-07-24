package revision;

public class VowelTAsk {
	public static void main(String[] args) {
 			int vowels = 0;
			int consonents = 0;
			String str = "manigandan";
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					vowels++;
				}
				else {
					consonents++;		
				}	
			}
			System.out.println("Vowel count is"+ " " +  vowels);
			System.out.println("consonents count is:" +" "+ consonents);
	}

}
