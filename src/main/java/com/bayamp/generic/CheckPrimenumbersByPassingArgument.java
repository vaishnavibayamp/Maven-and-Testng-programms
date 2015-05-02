package com.bayamp.generic;

public class CheckPrimenumbersByPassingArgument {

	public static void main(String[] args) {

		boolean checkwhetherthenumberisprimeornot = checkwhetherthenumberisprimeornot(1);
		System.out.println(checkwhetherthenumberisprimeornot);
	}

	private static boolean checkwhetherthenumberisprimeornot(int num) {
		if (num <= 0)
			return false;
		if (num == 1)
			return false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}

		return true;

	}
}
