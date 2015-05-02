package com.bayamp.library;

public class MethodToCalculateTheFacorialOfANumber {

	public int factorialbyiteration(int number) {
		int factorial = 1;
		for (int counter = 1; counter <= number; counter++) {
			factorial *= counter;

		}
		return factorial;

	}

	public static int factorialbyrecursion(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * factorialbyrecursion(number - 1);

		}

	}
}
