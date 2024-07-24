package array;
public class MainClass1 {
public static void main(String[] args) {                             
	int [] arr= {1,3,5,7,9};                                        
	for(int i=arr.length-1;i>=0;i--) {                          
		System.out.println(arr[i]);}                              
		System.out.println("------------------");               
		for(int j=0;j<=arr.length-1;j++) {                    
			System.out.println(arr[j]);                                 
		}                                                          
		System.out.println("--------------");                  
	char []dhamo= {'d','h','a','m','o','d','a','r','a','n'};    
	for(int z=0;z<=dhamo.length-1;z++) {                        
		if(z%2 ==0)                                             
			System.out.println(dhamo[z]);}                           
	System.out.println("-------------------");                        
		for(int k=0;k<=dhamo.length-1;k++) {                           
			if(k%2 != 0)                                                  
				System.out.println(dhamo[k]);                                
			}		                                                   
}                                                                                 
}                                                                                 