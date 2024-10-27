package removeDuplicate;

public class RemovedDuplicate {

	public static void main(String[] args) {

		String str = "malayalam";
		removeDuplicateFromString1(str); // optimal
		removeDuplicateFromString(str);
	}

	// optimal
	private static void removeDuplicateFromString1(String str) {

		boolean[] b = new boolean[256];

		char[] ch = str.toCharArray();

		StringBuilder removeDuplicate = new StringBuilder();

		for (int i = 0; i < ch.length; i++) {
			if (!b[ch[i]]) {
				b[ch[i]] = true;
				removeDuplicate.append(ch[i]);
			}
		}
		System.out.println();
	}

	private static void removeDuplicateFromString(String str) {
		System.out.println("str before removed duplicate : " + str);
		char[] ch = str.toCharArray();

		StringBuilder removeDuplicate = new StringBuilder();

		for (int i = 0; i < ch.length; i++) {
			if (removeDuplicate.toString().contains(ch[i] + "")) {
				continue;
			}
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					removeDuplicate.append(ch[i]);
					break;
				}
			}
			if (!removeDuplicate.toString().contains(ch[i] + "")) {
				removeDuplicate.append(ch[i]);
			}

		}
		System.out.println("str after removed duplicate  : " + removeDuplicate);
		System.out.println();
	}

}
