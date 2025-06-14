package Day1;

import java.util.*;

public class TaxCalculation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nameOfTheEmployee = "";
		String locationOfTheEmployee = "";
		String designation = "";
		float salary = 0.0f;
		float HRA = 0.0f;
		float DA = 0.0f;
		float bonus = 0.0f;


		System.out.println("Enter Name of the employee: ");
		nameOfTheEmployee = scanner.nextLine();
		System.out.println("Enter location of the employee: ");
		locationOfTheEmployee = scanner.nextLine();
		System.out.println("designation of the employee: ");
		designation = scanner.nextLine();
		System.out.println("Basic Salary of the employee: ");
		salary = scanner.nextFloat();
		
		if (locationOfTheEmployee.equals("cosmopolitin")) {
			HRA = salary * 15 / 100;
		} 
		else if (locationOfTheEmployee.equals("semi urban")) {
			HRA = salary * 10 / 100;
		}
		else {
			HRA = salary * 5 / 100;
		}

		DA = salary * 12 / 100;
		
		bonus = salary * 20 / 100;

		leveal1Calculations(HRA, DA, bonus, salary);
		leveal2Calculations(HRA, DA, bonus, salary);


		scanner.close();

	}


	static void leveal1Calculations(float HRA, float DA, float bonus, float salary) {
		
		float grossSalary = HRA + DA + salary + bonus;
		
		System.out.println("Monthly salary without bonous" + (salary + HRA + DA));
		System.out.println("Monthly Gross salary of an Employee is " + grossSalary );
		System.out.println("Annual Gross salary of an employee is " + (12 * grossSalary));
		System.out.println("Employee Bonus earned for the year " + (12 * bonus));
		
	}
	static void leveal2Calculations(float HRA, float DA, float bonus, float salary) {
		float grossSalary = HRA + DA + salary + bonus;
		
		float charity = salary * 5 / 100;
		float homeLoanInterest = 100000;
		float section87 = 50000;
		
		float tax = 0.0f;
		float taxableIncome = grossSalary - charity - homeLoanInterest - section87;
		
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
		
		System.out.println("Taxable income of the Employee is " + (taxableIncome));
		System.out.println("Tax need to pay by the EMployee is "+ tax);
	}
	
	
	
	}


