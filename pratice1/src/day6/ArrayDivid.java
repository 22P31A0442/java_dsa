
package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDivid {
	private static int n;
	private static int x;
	private static int y;
	public static void findNoOfPsInArray(int[] array) {
		Arrays.sort(array);
		System.out.println("No of Ps in the array is "+ (array[n - y - 1] - array[n - x - 1] - 1));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter n");
		n = scanner.nextInt();
		System.out.println("enter x");
		x = scanner.nextInt();
//		System.out.println("enter y");
		y = n - x;
		int[] array = new int[n];
		for(int i = 0;i < n; i++) {
			System.out.println("enter element");
			array[i] = scanner.nextInt();
		}
		if(n >= 2 && n <= 2000) {
			findNoOfPsInArray(array);
		}

				
		}
				
	}

