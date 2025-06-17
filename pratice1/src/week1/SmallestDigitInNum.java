package week1;

import java.util.Scanner;

public class SmallestDigitInNum {
	
	private static int inputNumber;
	private static int smallestDigit = 9;
	
	public static void findSmallestDigit() {
		int tempNumber = inputNumber;
		while(tempNumber > 0) {
			int remainder = tempNumber % 10;
			tempNumber = tempNumber / 10;
			if(remainder < smallestDigit) {
				smallestDigit = remainder;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find smallest digit ");
		inputNumber = scanner.nextInt();
		findSmallestDigit();
		System.out.println("smallest digit in a number " + inputNumber + " is " + smallestDigit);
		
	}

}
