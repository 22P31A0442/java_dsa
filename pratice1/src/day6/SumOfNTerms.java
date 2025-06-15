package day6;

import java.util.*;

public class SumOfNTerms {

	public static void main(String[] args) {
//		1 - n + n2 - n3 .... M
		Scanner scanner = new Scanner(System.in);
		int firstNumber = 0;
		int mTerms = 0;
		
		System.out.println("Enter first number of the series");
		firstNumber = scanner.nextInt();
		System.out.println("Enter No of Terms");
		mTerms = scanner.nextInt();
		
		System.out.println(sumOfSeries(firstNumber, mTerms));
		
		
		
	}
	
	static long sumOfSeries(int firstNumber, int mTerms) {
		
		long sumOfMTerms = 0;
		
		for(int i = 1; i <= mTerms; i++) {
			sumOfMTerms = sumOfMTerms + (long)(Math.pow(firstNumber,  i-1) * Math.pow(-1, i-1));
		}
		
		return sumOfMTerms;
	}

}
