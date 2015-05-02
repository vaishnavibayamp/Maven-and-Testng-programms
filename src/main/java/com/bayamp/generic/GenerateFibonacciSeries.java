package com.bayamp.generic;

import java.util.Scanner;

public class GenerateFibonacciSeries {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter number upto which Fibonacci series to print: ");
		int number = input.nextInt();
		if (number == 0) {
			System.out.println("0");
		} else if (number == 1) {
			System.out.println("0 1");
		} else {
			System.out.print("0 1 ");
			int a = 0;
			int b = 1;
			for (int i = 1; i < number; i++) {
				int nextNumber = a + b;
				System.out.print(nextNumber + " ");
				a = b;
				b = nextNumber;
			}
		}
		input.close();

	}

}
