package week1;

import java.util.Scanner;

public class HollowSquarePatteren {
	
	private static int noOfRows;
	
	public static void hollowSquare() {

		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfRows; j++) {
				if(i == 0 || j == 0 || i == noOfRows-1 || j == noOfRows-1) {
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
		System.out.println("Enter no of rows to print hollow square ");
		noOfRows = scanner.nextInt();
		hollowSquare();
	}
	
}
