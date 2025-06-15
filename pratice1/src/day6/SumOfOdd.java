package day6;

import java.util.Scanner;

public class SumOfOdd {

	private static int inputNumber;
	private static int sumOfDigits;
	
	public static void findSumOfOddDigits() {
		int tempNumber = inputNumber;
		while(tempNumber > 0) {
			int remainder = tempNumber % 10;
			tempNumber = tempNumber / 10;
			if(remainder % 2 == 1) {
				sumOfDigits = sumOfDigits + remainder;

			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to add odd digits");
		inputNumber = scanner.nextInt();
		findSumOfOddDigits();
		System.out.println("Sum of Odd digits in a "+ inputNumber+"is " + sumOfDigits);
	}

}
