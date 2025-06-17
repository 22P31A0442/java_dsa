package day1;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();
		int rootNumber = (int)Math.sqrt(inputNumber);
		if(rootNumber*rootNumber == inputNumber) {
			System.out.println(inputNumber + " is a Perfect Square");
		}
		else {
			System.out.println(inputNumber + "is not a perfect ");
		}
	}

}
