package removeDuplicate;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovedDuplicate {

	public static void main(String[] args) {

		String str = "malayalam";
		removeDuplicateFromString1(str); // optimal
		removeDuplicateFromString(str);

		String[] letters = str.split("");
		removeDuplicateFromStringArray(letters);
		removeDuplicateFromStringArray1(letters); // optimal

		int[] a = { 41, 1, 22, 9, 1, 9, 8, 0, 0, 41 };
		removeDuplicateFromIntArray(a);
		removeDuplicateFromIntArray1(a);
		removeDuplicateFromIntArray2(a);
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

	private static void removeDuplicateFromStringArray(String[] letters) {
		System.out.println("original str array : " + Arrays.toString(letters));
		StringBuilder removedDuplicate = new StringBuilder();
		for (int i = 0; i < letters.length; i++) {
			int counter = 0;
			if (removedDuplicate.toString().contains(letters[i])) {
				continue;
			}
			for (int j = i + 1; j < letters.length; j++) {
				if (letters[i].equals(letters[j])) {
					removedDuplicate.append(letters[i]);
					counter++;
					break;
				}
			}
			if (counter == 0) {
				removedDuplicate.append(letters[i]);
			}
		}
		System.out.println(
				"array after removed duplicate : " + Arrays.toString(removedDuplicate.toString().toCharArray()));
		System.out.println();
	}

	// optimal
	private static void removeDuplicateFromStringArray1(String[] letters) {
		System.out.println("original str array : " + Arrays.toString(letters));
		StringBuilder removedDuplicate = new StringBuilder();
		boolean[] b = new boolean[256];
		for (int i = 0; i < letters.length; i++) {
			if (!b[letters[i].charAt(0)]) {
				b[letters[i].charAt(0)] = true;
				removedDuplicate.append(letters[i].charAt(0));
			}
		}
		System.out.println(
				"array after removed duplicate : " + Arrays.toString(removedDuplicate.toString().toCharArray()));
		System.out.println();
	}

	private static void removeDuplicateFromIntArray(int[] a) {
		int[] temp = new int[a.length];
		System.out.println("original int array : " + Arrays.toString(a));
		int index = 0;
		boolean[] b = new boolean[100];
		for (int i = 0; i < a.length; i++) {
			if (!b[a[i]]) {
				b[a[i]] = true;
				temp[index++] = a[i];
			}
		}
		int[] a1 = Arrays.copyOf(temp, index);
		System.out.println("array after removed duplicate : " + Arrays.toString(a1));
		System.out.println();
	}

	private static void removeDuplicateFromIntArray1(int[] a) {
		System.out.println("original int array : " + Arrays.toString(a));
		Set<Integer> set = new LinkedHashSet<>();
		for (int i : a) {
			set.add(i);
		}
		System.out.println("array after removed duplicate : " + Arrays.toString(set.toArray()));
		System.out.println();
	}

	private static void removeDuplicateFromIntArray2(int[] a) {
		System.out.println("original int array : " + Arrays.toString(a));
		Integer[] temp = new Integer[a.length];
		int index = a.length - 1;
		int var = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			int counter = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (a[i] == a[j]) {
					counter++;
					break;
				}
			}
			if (counter == 0) {
				var++;
				temp[index--] = a[i];
			}
		}
		int[] na = new int[var];
		for (int i = 0; i < na.length; i++) {
			na[i] = temp[index++ + 1];
		}
		System.out.println("array after removed duplicate : " + Arrays.toString(na));
		System.out.println();
	}
}
