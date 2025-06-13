package Day1;

import java.util.Scanner;

public class SushmaAverageScore {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int AverageMarks = 0;
		System.out.println("Enter a marks of sushma to check");
		AverageMarks = scanner.nextInt();
		if(AverageMarks >= 0 && AverageMarks <= 59) {
			System.out.println("Fail in Exam");
		}
		else if(AverageMarks >= 60 && AverageMarks <= 80) {
			System.out.println("Second class");
		}
		else if(AverageMarks >= 81 && AverageMarks <= 95) {
			System.out.println("First class");
		}
		else if(AverageMarks >= 96 && AverageMarks <=100){
			System.out.println("Outstanding");
		}
		else {
			System.out.println("Invalid Marks. Marks must between 0 to 100");
		}
		
		scanner.close();
	}
	
}
