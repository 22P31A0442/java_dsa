package Day1;

import java.util.*;

public class taxCalculation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nameOfTheEmployee = "";
		String locationOfTheEmployee = "";
		String designation = "";
		float salary = 0.0f;
		
		nameOfTheEmployee = scanner.nextLine();
		locationOfTheEmployee = scanner.nextLine();
		designation = scanner.nextLine();
		salary = scanner.nextFloat();
		
		Level1(nameOfTheEmployee, locationOfTheEmployee, designation, salary);
		
		scanner.close();

	}
	
	static void Level1(String nameOfTheEmployee, String locationOfTHeEmployee, String designation, float salary) {
		
	}

	
}
