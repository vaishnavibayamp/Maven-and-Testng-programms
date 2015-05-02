package com.bayamp.generic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 30;
		int number2 = 60;

		System.out
				.println("The value of number1 and number2 before swapping is: "
						+ number1 + " and " + number2);

		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;

		System.out
				.println("The value of number1 and number2 after swapping is: "
						+ number1 + " and " + number2);
	}

}
