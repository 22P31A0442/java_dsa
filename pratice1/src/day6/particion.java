package day6;

import java.util.Arrays;
import java.util.Scanner;

public class particion {
	
	private static int n;
//	private static int i;
	private static int j;
	private static int pivot;
	
	public static void makePartions(int[] array) {
		pivot = array[n-1];
		for(int i = 0; i < n-1;i++) {
			if(array[i] < pivot) {
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
		int temp = array[n-1];
		array[n-1] = array[j];
		array[j] = temp;
		System.out.println(Arrays.toString(array));
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr length of the array");
		n = scanner.nextInt();
		System.out.println("enetr elements in the array");
		int[] array = new int[n];
		
		for(int i = 0; i < n;i++) {
			array[i] = scanner.nextInt();
		}
		
		makePartions(array);
		
	}

}
