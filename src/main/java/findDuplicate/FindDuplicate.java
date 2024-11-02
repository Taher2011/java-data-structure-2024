package findDuplicate;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {

		String str = "malayalam";
		findDuplicateFromString(str); // optimal
		findDuplicateFromString1(str);

		String[] letters = str.split("");
		findDuplicateFromStringArray(letters);

		int[] a = { 41, 1, 22, 9, 1, 9, 8, 0, 0, 41 };
		findDuplicateFromIntArray(a);
	}

	private static void findDuplicateFromString(String str) {
		System.out.println("original str : " + str);
		char[] ch = str.toCharArray();
		StringBuilder duplicatechar = new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			if (duplicatechar.toString().contains(ch[i] + "")) {
				continue;
			}
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					duplicatechar.append(ch[i]);
					break;
				}
			}
		}
		System.out.println("duplicate char : " + duplicatechar);
		System.out.println();
	}

	// optimal
	private static void findDuplicateFromString1(String str) {
		System.out.println("original str : " + str);
		char[] ch = str.toCharArray();
		boolean[] b = new boolean[256];
		StringBuilder duplicatechar = new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			if (b[ch[i]]) {
				continue;
			}
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					b[ch[i]] = true;
					duplicatechar.append(ch[i]);
					break;
				}
			}
		}
		System.out.println("duplicate char : " + duplicatechar);
		System.out.println();
	}

	private static void findDuplicateFromStringArray(String[] letters) {
		System.out.println("original str array : " + Arrays.toString(letters));
		StringBuilder duplicatechar = new StringBuilder();
		boolean[] b = new boolean[256];
		for (int i = 0; i < letters.length; i++) {
			if (b[letters[i].charAt(0)]) {
				continue;
			}
			for (int j = i + 1; j < letters.length; j++) {
				if (letters[i].equals(letters[j])) {
					b[letters[i].charAt(0)] = true;
					duplicatechar.append(letters[i]);
					break;
				}
			}
		}
		System.out.println("duplicate char : " + duplicatechar);
		System.out.println();
	}

	private static void findDuplicateFromIntArray(int[] a) {
		System.out.println("original int array : " + Arrays.toString(a));
		StringBuilder duplicatechar = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					duplicatechar.append(a[i] + " ");
					break;
				}
			}
		}
		System.out.println("duplicate char : " + duplicatechar);
	}
}
