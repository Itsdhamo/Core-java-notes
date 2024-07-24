package ZohoInterview;

public class Program4 {	    
	    // Function to check if a number is prime
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        if (n <= 3) {
	            return true;
	        }
	        if (n % 2 == 0 || n % 3 == 0) {
	            return false;
	        }
	        for (int i = 5; i * i <= n; i = i + 6) {
	            if (n % i == 0 || n % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    // Function to find the least prime number that can be added to the first array element
	    public static int findLeastPrime(int[] arr1, int[] arr2) {
	        int leastPrime = Integer.MAX_VALUE;
	        
	        for (int i = 0; i < arr1.length; i++) {
	            int remainder = arr2[i] % arr1[i];
	            
	            // If the remainder is already zero, no need to add any prime number
	            if (remainder == 0) {
	                continue;
	            }
	            
	            // Find the smallest prime number that can be added to make the remainder zero
	            for (int j = 1; j <= 1000; j++) {
	                if (isPrime(j) && (j - remainder) % arr1[i] == 0) {
	                    leastPrime = Math.min(leastPrime, j);
	                    break;
	                }
	            }
	        }
	        
	        // If leastPrime is still Integer.MAX_VALUE, no suitable prime number found
	        return leastPrime == Integer.MAX_VALUE ? -1 : leastPrime;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr1 = {2, 3, 5};
	        int[] arr2 = {6, 10, 15};
	        
	        int leastPrime = findLeastPrime(arr1, arr2);
	        
	        System.out.println("The least prime number that can be added is: " + leastPrime);
	    }
	}