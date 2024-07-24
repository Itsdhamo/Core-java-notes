package interviewprogram;

import java.util.*;
import revision.scanner;

public class IDAcoinProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("enter the elements = ");
			int element = sc.nextInt();
			arr[i] = element;
		}
		int noc = 0;
		for (int i = 0; i < arr.length; i++) {
			noc = arr[i];
			int temp = 0;
			for (int j = 0; j < noc; j++) {
				for (int k = 0; k <= j; k++) {
					if (temp < noc) {
						System.out.print("o");
					}
					temp++;
				}
				System.out.println();
			}
		}
	}
}