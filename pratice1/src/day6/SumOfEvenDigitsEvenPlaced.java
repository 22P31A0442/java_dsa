package day6;

import java.util.Scanner;

public class SumOfEvenDigitsEvenPlaced {
	
	private static int inputNumber;
	private static int sumOfEvenDigits;
	
	public static void findSumOfEvenPlacedDigits() {
		int tempNumber = inputNumber;
		int noOfDigits = (int)Math.log10(tempNumber)+1;
		while(tempNumber > 0) {
			int remainder = tempNumber % 10;
			tempNumber = tempNumber / 10;
			if(noOfDigits % 2 == 0 && remainder % 2 == 0) {
				sumOfEvenDigits += remainder;
			}
			noOfDigits--;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to add even placed digits");
		inputNumber = scanner.nextInt();
		findSumOfEvenPlacedDigits();
		System.out.println("Sum of Odd digits in a " + inputNumber + " is " + sumOfEvenDigits);
		
	}

}
