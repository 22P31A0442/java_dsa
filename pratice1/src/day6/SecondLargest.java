package day6;

import java.util.Scanner;

public class SecondLargest {

	
		private static int inputNumber;
		private static int secondMaxNumber;
		
		public static void largestdigit() {
			int assumedMaximumdigit = 0;
			int tempNumber = inputNumber;
			while(tempNumber > 0) {
				int remainder = tempNumber % 10;
				tempNumber = tempNumber / 10;
				if(assumedMaximumdigit < remainder) {
					assumedMaximumdigit = remainder;
				}
				
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number to finf second largest digit in it");
			inputNumber = scanner.nextIwnt();
			findSecondLargestDigit();
			System.out.println("2nd largest digit of a number " + inputNumber + " is " + secondMaxNumber);
			
		
		

	}

}
