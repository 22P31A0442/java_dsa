package week1;

import java.util.Scanner;

public class XInHollowSuare {
	
	private static int noOfRows;
	
	public static void x() {

		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfRows; j++) {
				if(i == j || j == noOfRows - 1 - i || i == 0 || j == 0 || i == noOfRows-1 || j == noOfRows-1) {
					System.out.print("@");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of rows to print x shape in Hollow Square ");
		noOfRows = scanner.nextInt();
		x();
	}
	
}
