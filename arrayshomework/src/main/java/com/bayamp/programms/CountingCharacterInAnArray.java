package com.bayamp.programms;

public class CountingCharacterInAnArray {

	public static void main(String[] args) {

		String str = "aabbaacddaa";
		char[] c = str.toCharArray();
		int sz = c.length;
		int i = 0;
		int j = 0;
		int counter = 0;

		for (i = 0; i < sz; ++i) {
			counter = 0;
			for (j = 0; j < sz; ++j) {
				if (j < i && c[i] == c[j]) {
					break;
				}
				if (c[j] == c[i]) {
					counter++;
				}
				if (j == sz - 1) {
					System.out.println("The character " + c[i] + " is present "
							+ counter + " times");
				}
			}

		}
	}

}
