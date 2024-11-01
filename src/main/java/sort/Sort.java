package sort;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		String string = "listen";
		sortString(string);

		String[] chAsc = string.split("");
		sortStringArrayAsc(chAsc);

		String[] chDsc = string.split("");
		sortStringArrayDsc(chDsc);

		int[] a = { 3, 5, 1, 6, 2, 4 };
		sortIntegerArrayAsc(a);

		int[] b = { 3, 5, 1, 6, 2, 4 };
		sortIntegerArrayDsc(b);
	}

	private static void sortString(String string) {
		System.out.println("unsorted string : " + string);
		char[] ch = string.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char temp;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}
			}
		}
		System.out.println("sorted string   : " + new String(ch));
		System.out.println();
	}

	private static void sortStringArrayAsc(String[] ch) {
		System.out.println("unsorted string array   : " + Arrays.toString(ch));
		for (int i = 0; i < ch.length; i++) {
			String temp;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i].compareTo(ch[j]) > 1) {
					temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}
			}
		}
		System.out.println("sorted string array asc : " + Arrays.toString(ch));
		System.out.println();
	}

	private static void sortStringArrayDsc(String[] ch) {
		System.out.println("unsorted string array   : " + Arrays.toString(ch));
		for (int i = 0; i < ch.length; i++) {
			String temp;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i].compareTo(ch[j]) < 1) {
					temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}
			}
		}
		System.out.println("sorted string array dsc : " + Arrays.toString(ch));
		System.out.println();
	}

	private static void sortIntegerArrayAsc(int[] ch) {
		System.out.println("unsorted int array   : " + Arrays.toString(ch));
		for (int i = 0; i < ch.length; i++) {
			int temp;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}
			}
		}
		System.out.println("sorted int array asc : " + Arrays.toString(ch));
		System.out.println();
	}

	private static void sortIntegerArrayDsc(int[] ch) {
		System.out.println("unsorted int array   : " + Arrays.toString(ch));
		for (int i = 0; i < ch.length; i++) {
			int temp;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}
			}
		}
		System.out.println("sorted int array dsc : " + Arrays.toString(ch));
		System.out.println();
	}
}
