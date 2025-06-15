//package Day1;
//
//import java.util.Scanner;
//
//public class SushmaAverageScore {
//	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int AverageMarks = 0;
//		System.out.println("Enter a marks of sushma to check");
//		AverageMarks = scanner.nextInt();
//		if(AverageMarks >= 0 && AverageMarks <= 59) {
//			System.out.println("Fail in Exam");
//		}
//		else if(AverageMarks >= 60 && AverageMarks <= 80) {
//			System.out.println("Second class");
//		}
//		else if(AverageMarks >= 81 && AverageMarks <= 95) {
//			System.out.println("First class");
//		}
//		else if(AverageMarks >= 96 && AverageMarks <=100){
//			System.out.println("Outstanding");
//		}
//		else {
//			System.out.println("Invalid Marks. Marks must between 0 to 100");
//		}
//		
//		scanner.close();
//	}
//	
//}


package Day1;

import java.util.*;

public class SushmaAverageScore {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nameOfTheEmployee = "";
		String locationOfTheEmployee = "";
		String designation = "";
		float salary = 0.0f;
		float HRA = 0.0f;
		float DA = 0.0f;
		float bonus = 0.0f;
		float grossSalary = 0.0f;
		float taxableIncome =0.0f;
		float tax = 0.0f;


		System.out.println("Enter Name of the employee: ");
		nameOfTheEmployee = scanner.nextLine();
		System.out.println("Enter location of the employee: ");
		locationOfTheEmployee = scanner.nextLine();
		System.out.println("designation of the employee: ");
		designation = scanner.nextLine();
		System.out.println("Basic Salary of the employee: ");
		salary = scanner.nextFloat();
		
		HRA = HRA(locationOfTheEmployee,salary);
		DA = salary * 12 / 100;
		bonus = salary * 20 / 100;
		grossSalary = HRA + DA + salary + bonus;
		
		leveal1Calculations(HRA, DA, bonus, salary, grossSalary);

		taxableIncome = TaxableIncome(grossSalary, salary);
		tax = TaxToPay(taxableIncome);
		


//		leveal2Calculations(HRA, DA, bonus, salary);


		scanner.close();

	}
	
	static float HRA(String locationOfTheEmployee, float salary) {
		float HRAResult = 0.0f;
		if (locationOfTheEmployee.equals("cosmopolitin")) {
			HRAResult = salary * 15 / 100;
		} 
		else if (locationOfTheEmployee.equals("semi urban")) {
			HRAResult = salary * 10 / 100;
		}
		else {
			HRAResult = salary * 5 / 100;
		}
		return HRAResult;
	}
	
	
	
	static void leveal1Calculations(float HRA, float DA, float bonus, float salary, float grossSalary) {
		
		
		System.out.println("Monthly salary without bonous" + (salary + HRA + DA));
		System.out.println("Monthly Gross salary of an Employee is " + grossSalary );
		System.out.println("Annual Gross salary of an employee is " + (12 * grossSalary));
		System.out.println("Employee Bonus earned for the year " + (12 * bonus));
		
	}
	static float TaxableIncome(float grossSalary, float salary) {
		
		
		float charity = salary * 5 / 100;
		float homeLoanInterest = 100000;
		float section87 = 50000;
		
		
		float taxableIncome = grossSalary - charity - homeLoanInterest - section87;
		System.out.println("Taxable income of the Employee is " + (taxableIncome));
		return taxableIncome;
		
		
	}
	static float TaxToPay(float taxableIncome) {
		float tax = 0.0f;
		if(taxableIncome <= 500000) {
			tax = 0.0f;
		}
		else if(taxableIncome <= 800000) {
			tax = taxableIncome * 10 / 100;
		}
		else if(taxableIncome <= 1000000) {
			tax = taxableIncome * 15 / 100;
		}
		else if(taxableIncome <= 1200000) {
			tax = taxableIncome * 20 / 100;
		}
		else if(taxableIncome <= 1500000) {
			tax = taxableIncome * 25 / 100;
		}
		else if(taxableIncome <= 2000000) {
			tax = taxableIncome * 30 / 100;
		}
		else {
			tax = taxableIncome * 35 / 100;
		}
		
		System.out.println("Tax need to pay by the EMployee is "+ tax);
		return tax;
		
	}
	
	
	
	}



