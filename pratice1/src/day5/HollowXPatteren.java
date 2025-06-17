package day5;

import java.util.Scanner;

public class HollowXPatteren {
	
	private static int noOfLines;
	
	public static void printPattern() {
		if(noOfLines % 2 == 1) {
			for(int i = 1; i <= noOfLines; i++) {
				for(int j = 1; j <= noOfLines; j++) {
					if(i == (noOfLines / 2 + 1) && i == j) {
						System.out.print("@");
					}
					else if(i == j || i == 1 || i == noOfLines || j == 1 || j == noOfLines || j == noOfLines - i + 1 ) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Please enter Odd number");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of lines");
		noOfLines = scanner.nextInt();
		printPattern();
		

	}

}
