package com.bayamp.generic;

import java.util.Scanner;

import com.bayamp.library.MethodToCalculateTheFacorialOfANumber;

public class CallingMethodToCalculateTheFacorialOfANumberByRecursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter the value of number whose factorial is to be found:");
		int number = input.nextInt();

		int factorialbyrecursion = MethodToCalculateTheFacorialOfANumber
				.factorialbyrecursion(number);

		System.out.println("The factorial of " + number + " is: "
				+ factorialbyrecursion);
		input.close();

	}

}
