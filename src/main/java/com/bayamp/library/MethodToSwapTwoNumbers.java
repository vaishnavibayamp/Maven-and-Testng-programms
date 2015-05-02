package com.bayamp.library;

public class MethodToSwapTwoNumbers {

	public void swaptwonumbersbyobject(int num1, int num2) {
		System.out.println("Before swapping: \nThe value of num1 is: " + num1
				+ "\nThe value of num2 is: " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After swapping: \nThe value of num1 is: " + num1
				+ "\nThe value of num2 is: " + num2);

	}

	public static void swaptwonumbersbyclassname(int numb1, int numb2) {
		System.out.println("Before swapping: \nThe value of numb1 is: " + numb1
				+ "\nThe value of numb2 is: " + numb2);

		numb1 = numb1 + numb2;
		numb2 = numb1 - numb2;
		numb1 = numb1 - numb2;

		System.out.println("After swapping: \nThe value of numb1 is: " + numb1
				+ "\nThe value of numb2 is: " + numb2);

	}
}