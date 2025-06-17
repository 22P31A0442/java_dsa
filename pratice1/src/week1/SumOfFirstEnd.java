package week1;

import java.util.Scanner;

public class SumOfFirstEnd {
	private static int sumOfDigits;
	private static int number;
	
	public static void findSumOfDigits() {
		int tempNumber = number;
		int noOfDigits = (int)Math.log10(tempNumber) + 1;
		int count = noOfDigits;
		while(tempNumber > 0) {
			int remainder = tempNumber % 10;
			tempNumber = tempNumber / 10;
			if(count == noOfDigits || count == 1) {
				sumOfDigits += remainder;
			}
			count--;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number to add first and last digit of a number ");
		number = scanner.nextInt();
		
		findSumOfDigits();
		System.out.println("Sum of First and Last Digit of a number is " + sumOfDigits);
		
	}

}
