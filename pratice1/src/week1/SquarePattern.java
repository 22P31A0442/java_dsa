package week1;

import java.util.Scanner;

public class SquarePattern {
	
	private static int noOfRows;
	
	public static void rightAngle() {
		
		for(int i = 0; i < noOfRows; i++) {
			for(int j = 0; j <= noOfRows; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of rows to print square ");
		noOfRows = scanner.nextInt();
		rightAngle();
	}
	
}
