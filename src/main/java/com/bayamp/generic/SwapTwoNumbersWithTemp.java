package com.bayamp.generic;

import java.util.Scanner;

public class SwapTwoNumbersWithTemp {

	public static void main(String[] args) {

		int number1, number2, temp;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of number1 and number2: ");
		number1 = input.nextInt();
		number2 = input.nextInt();

		System.out.println("Before swapping: \nThe value of number1 is: "
				+ number1 + "\nThe value of number2 is: " + number2);

		temp = number1;
		number1 = number2;
		number2 = temp;

		System.out.println("After swapping: \nThe value of number1 is: "
				+ number1 + "\nThe value of number2 is: " + number2);
		input.close();
	}

}
