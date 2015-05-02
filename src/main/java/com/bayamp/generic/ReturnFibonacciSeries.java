package com.bayamp.generic;

import java.util.Scanner;

public class ReturnFibonacciSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter number upto which Fibonacci series to print: ");
		int number = input.nextInt();
		input.close();

		for (int i = 0; i < number; i++) {
			System.out.println(fibonacci(i));
		}

	}

	private static int fibonacci(int number) {
		if (number == 0) {
			return 0;
		}
		int firstnumber = 0;
		int secondnumber = 1;

		for (int i = 1; i < number; i++) {
			int temp = secondnumber;
			secondnumber += firstnumber;
			firstnumber = temp;
		}

		return (secondnumber);
	}
}
