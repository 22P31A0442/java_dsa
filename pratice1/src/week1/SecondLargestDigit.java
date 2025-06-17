package week1;

import java.util.Scanner;

public class SecondLargestDigit {

	
		private static int inputNumber;
		private static int secondMaxNumber;
		private static int assumedMaximumdigit;
		
		public static void findSecondLargestDigit() {
			int tempNumber = inputNumber;
			while(tempNumber > 0) {
				int remainder = tempNumber % 10;
				tempNumber = tempNumber / 10;
				if(remainder > assumedMaximumdigit) {
					secondMaxNumber = assumedMaximumdigit;
					assumedMaximumdigit = remainder;
				}
				if(secondMaxNumber < remainder && remainder < assumedMaximumdigit ) {
					secondMaxNumber = remainder;
				}
			}
				
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number to finf second largest digit in it");
			inputNumber = scanner.nextInt();
			findSecondLargestDigit();
			System.out.println("2nd largest digit of a number " + inputNumber + " is " + secondMaxNumber);
			
		
		

	}

}
