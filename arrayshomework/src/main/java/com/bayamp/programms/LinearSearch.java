package com.bayamp.programms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int i, numbers, search, array[];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements");
		numbers = input.nextInt();
		array = new int[numbers];

		System.out.println("Enter " + numbers + " integers");

		for (i = 0; i < numbers; i++)
			array[i] = input.nextInt();

		System.out.println("Enter value to find");
		search = input.nextInt();

		for (i = 0; i < numbers; i++) {
			if (array[i] == search) 
			{
				System.out.println(search + " is present at location "
						+ (i + 1) + ".");
				break;
			}
		}
		if (i == numbers)
			System.out.println(search + " is not present in array.");
		input.close();

	}

}
