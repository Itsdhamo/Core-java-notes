package ZohoInterview;
import java.util.*;
public class Program5 {
	    // Custom comparator to compare elements based on their frequency
	    static class FrequencyComparator implements Comparator<Integer> {
	        Map<Integer, Integer> freqMap;
	        
	        public FrequencyComparator(Map<Integer, Integer> freqMap) {
	            this.freqMap = freqMap;
	        }
	        
	        @Override
	        public int compare(Integer num1, Integer num2) {
	            int freqCompare = freqMap.get(num2).compareTo(freqMap.get(num1)); // Compare frequencies in descending order
	            
	            // If frequencies are equal, compare the numbers themselves
	            if (freqCompare == 0) {
	                return num1.compareTo(num2); // Sort numbers in ascending order
	            }
	            
	            return freqCompare;
	        }
	    }
	    
	    // Function to sort array elements by frequency in descending order
	    public static void sortByFrequency(int[] arr) {
	        // Create a HashMap to store frequency of each element
	        Map<Integer, Integer> frequencyMap = new HashMap<>();
	        
	        // Count the frequency of each element
	        for (int num : arr) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }
	        
	        // Create a list of unique elements
	        List<Integer> uniqueElements = new ArrayList<>(frequencyMap.keySet());
	        
	        // Sort the unique elements using custom comparator based on their frequency
	        Collections.sort(uniqueElements, new FrequencyComparator(frequencyMap));
	        
	        // Reconstruct the array based on sorted unique elements and their frequencies
	        int index = 0;
	        for (int num : uniqueElements) {
	            int frequency = frequencyMap.get(num);
	            for (int i = 0; i < frequency; i++) {
	                arr[index++] = num;
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {2, 3, 4, 5, 2, 3,3, 5, 5, 5};
	        
	        System.out.println("Original array: " + Arrays.toString(arr));
	        
	        sortByFrequency(arr);
	        
	        System.out.println("Array sorted by frequency: " + Arrays.toString(arr));
	    }
	}