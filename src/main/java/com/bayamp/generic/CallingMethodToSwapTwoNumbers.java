package com.bayamp.generic;

import java.util.Scanner;

import com.bayamp.library.MethodToSwapTwoNumbers;

public class CallingMethodToSwapTwoNumbers {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of num1 and num2:");
		System.out.println("Enter the value of numb1 and numb2:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int numb1 = input.nextInt();
		int numb2 = input.nextInt();
		MethodToSwapTwoNumbers call = new MethodToSwapTwoNumbers();
		call.swaptwonumbersbyobject(num1, num2);

		MethodToSwapTwoNumbers.swaptwonumbersbyclassname(numb1, numb2);
		input.close();

	}

}
