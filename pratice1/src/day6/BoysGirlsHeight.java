package day6;

import java.util.Arrays;
import java.util.Scanner;

public class BoysGirlsHeight {
	private static int testCases;
	private static int noOfStudents;
	
	public static String checkArrangment(int[] girls, int[] boys) {
		Arrays.sort(girls);
		Arrays.sort(boys);
		
		for(int i = 1; i < noOfStudents; i++) {
			if(girls[i] < boys[i]) {
				for(int j = 1; j < noOfStudents; j++) {
					if(girls[j] > boys[j]) {
						return "no";
					}
				}
				return "YES";
			}
			else if(girls[i] > boys[i]) {
				for(int j = 1; j < noOfStudents; j++) {
					if(girls[j] < boys[j]) {
						return "no";
					}
				}
				return "YES";
			}
			return "no";
			
		}
		return "no";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter t");
		testCases = scanner.nextInt();

		for(int i = 0; i < testCases; i++) {
			System.out.println("enter n");
			noOfStudents = scanner.nextInt();
			int[] girls = new int[noOfStudents];
			int[] boys = new int[noOfStudents];

			for(int j = 0; j < noOfStudents; j++) {
				girls[j] = scanner.nextInt();
			}
			for(int j = 0; j < noOfStudents; j++) {
				boys[j] = scanner.nextInt();
			}
			System.out.println(checkArrangment(girls, boys));
		}
		
	}
}
