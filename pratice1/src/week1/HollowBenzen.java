package week1;

import java.util.Scanner;

public class HollowBenzen {
	
	private static int noOfRows;
	
	public static void benzenRing() {

		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfRows*2; j++) {
				if(j == noOfRows - 1 - i && i < noOfRows) {
					System.out.print("@");
				}
				else if (noOfRows == (int)Math.abs(i-j)) {
					System.out.print("@");
				}
				else{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	
		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfRows*2; j++) {
				if(j == 0 || j == noOfRows*2 - 1) {
					System.out.print("@");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfRows*2; j++) {
				if(j == i && i < noOfRows) {
					System.out.print("@");
				}
				else if (noOfRows * 2 - 1 == i + j) {
					System.out.print("@");
				}
				else{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	
}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of rows to print Benzen Ring ");
		noOfRows = scanner.nextInt();
		benzenRing();
	}
	
}
