package javatest;
import java.util.Scanner;

public class QuestionOne {
	
	public static void main(String [] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr [] = new int[n];
		System.out.println("Enter the number into the array");
		for(int i = 0 ; i < n ; i ++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < n ; i ++) {
			
			if(isPrime(arr[i])) {
				
				int num = arr[i];
				int sum = 0;
				
				while(num > 0) {
					sum =sum+ num % 10;
					num = num /10;
					
				}
				
				if(isPrime(sum)) {
					System.out.print(arr[i]+" ");
				}
			}
		}
		
		System.out.println();
		
	}

	// function to find the prime number
	private static boolean isPrime(int num) {
		
		boolean isPrimeNumber = true;
		
		for(int i = 2 ; i * i <= num ; i ++) {
			if(num % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		return isPrimeNumber;
	}
}

//Time complexity of this code is O(n^3/2)