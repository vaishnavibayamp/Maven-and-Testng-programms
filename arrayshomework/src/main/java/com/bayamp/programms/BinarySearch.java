package com.bayamp.programms;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int i, first, last, middle, numbers, search, array[];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements");
		numbers = input.nextInt();
		array = new int[numbers];

		System.out.println("Enter " + numbers + " integers");

		for (i = 0; i < numbers; i++)
			array[i] = input.nextInt();

		System.out.println("Enter value to find");
		search = input.nextInt();

		first = 0;
		last = numbers - 1;
		middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] < search)
				first = middle + 1;
			else if (array[middle] == search) {
				System.out.println(search + " found at location "
						+ (middle + 1) + ".");
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println(search + " is not present in the list.\n");
		input.close();
	}

}
