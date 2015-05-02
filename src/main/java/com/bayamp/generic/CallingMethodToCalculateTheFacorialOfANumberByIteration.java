package com.bayamp.generic;

import java.util.Scanner;

import com.bayamp.library.MethodToCalculateTheFacorialOfANumber;

public class CallingMethodToCalculateTheFacorialOfANumberByIteration {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter the value of number whose factorial is to be found:");
		int number = input.nextInt();

		MethodToCalculateTheFacorialOfANumber call = new MethodToCalculateTheFacorialOfANumber();
		int factorialbyiteration = call.factorialbyiteration(number);

		System.out.println("The factorial of " + number + " is: "
				+ factorialbyiteration);
		input.close();

	}

}
