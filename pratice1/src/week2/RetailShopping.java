package week2;

import java.util.Scanner;

public class RetailShopping {

	private static int code;
	private static String description;
	private static int quantity;
	private static int price;
	private static int priceOfTheItem;
	private static int grandTotal;
	private static int latestGrandTotal;
	private static int itemCount;
	private static String memberShip;
	private static int isAnyItems = 1;
	
	public static void findPriceOfTheItem() {
		priceOfTheItem = quantity * price;
		System.out.println("Price of the " + description + " is "+ priceOfTheItem);

	}
	
	public static void findGrandTotal() {
		grandTotal = grandTotal + priceOfTheItem;
	}
	
	public static void findLatestGrandTotal() {
		if(grandTotal > 10000) {
			latestGrandTotal = grandTotal * 10 / 100;
		}
		else if(grandTotal < 1000) {
			latestGrandTotal = (int)(grandTotal + grandTotal * 2.5 /100);
		}
		
		else if(itemCount > 20) {
			latestGrandTotal = latestGrandTotal * 5 / 100;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(isAnyItems != 0) {
			System.out.println("Enter Code Of the item");
			code = scanner.nextInt();
			System.out.println("Enter description Of the item");
			description = scanner.next();
			System.out.println("Enter quantity Of the item");
			quantity = scanner.nextInt();
			System.out.println("Enter price Of the item");

			price = scanner.nextInt();
			findPriceOfTheItem();
			
			findGrandTotal();
			
			itemCount++;
			
			System.out.println("Is any other Item to Scan if yes 1 else 0");
			isAnyItems = scanner.nextInt();

		}
		System.out.println("Grand total is" + grandTotal);
		
		findLatestGrandTotal();
		
		System.out.print("Is costumor has membership yes or no");
		memberShip = scanner.nextLine();
		
		if(memberShip == "yes") {
			latestGrandTotal = latestGrandTotal * 2 / 100;
		}
		
		System.out.print(latestGrandTotal);
		
		

	}

}
