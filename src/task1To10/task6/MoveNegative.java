package task1To10.task6;

import java.util.Scanner;

public class MoveNegative {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int arr1[] = new int[10], i, j, temp = 0;
		System.out.println("enter the value of array:");
		for (i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		} 
		for (i = 0; i < 10; i++) {
			for (j = i + 1; j < 10; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} 
			} 
		} 
		System.out.println("new series is:");
		for (i = 0; i < 10; i++) {
			System.out.print(" " + arr[i]);
		} 
	}

}
