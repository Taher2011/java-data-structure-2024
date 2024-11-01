package removeDuplicate;

import java.util.Arrays;

public class RemovedDuplicate {

	public static void main(String[] args) {

		String str = "malayalam";
		removeDuplicateFromString1(str); // optimal
		removeDuplicateFromString(str);
		removeDuplicateFromStringArray(str.toCharArray());
		removeDuplicateFromStringArray1(str.toCharArray()); // optimal

	}

	// optimal
	private static void removeDuplicateFromString1(String str) {
		System.out.println("original str : " + str);
		boolean[] b = new boolean[256];
		StringBuilder removedDuplicate = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!b[ch]) {
				b[ch] = true;
				removedDuplicate.append(ch);
			}
		}
		System.out.println("str after removed duplicate : " + removedDuplicate);
		System.out.println();
	}

	private static void removeDuplicateFromString(String str) {
		System.out.println("original str : " + str);
		StringBuilder removedDuplicate = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			int counter = 0;
			if (removedDuplicate.toString().contains(str.charAt(i) + "")) {
				continue;
			}
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					removedDuplicate.append(str.charAt(i));
					counter++;
					break;
				}
			}
			if (counter == 0) {
				removedDuplicate.append(str.charAt(i));
			}
		}
		System.out.println("str after removed duplicate : " + removedDuplicate);
		System.out.println();
	}

	private static void removeDuplicateFromStringArray(char[] ch) {
		System.out.println("original array : " + Arrays.toString(ch));
		StringBuilder removedDuplicate = new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			int counter = 0;
			if (removedDuplicate.toString().contains(ch[i] + "")) {
				continue;
			}
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					removedDuplicate.append(ch[i]);
					counter++;
					break;
				}
			}
			if (counter == 0) {
				removedDuplicate.append(ch[i]);
			}
		}
		System.out.println(
				"array after removed duplicate : " + Arrays.toString(removedDuplicate.toString().toCharArray()));
		System.out.println();
	}

	// optimal
	private static void removeDuplicateFromStringArray1(char[] ch) {
		System.out.println("original array : " + Arrays.toString(ch));
		StringBuilder removedDuplicate = new StringBuilder();
		boolean[] b = new boolean[256];
		for (int i = 0; i < ch.length; i++) {
			if (!b[ch[i]]) {
				b[ch[i]] = true;
				removedDuplicate.append(ch[i]);
			}
		}
		System.out.println(
				"array after removed duplicate : " + Arrays.toString(removedDuplicate.toString().toCharArray()));
	}

}
