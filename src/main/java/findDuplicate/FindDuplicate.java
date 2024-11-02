package findDuplicate;

public class FindDuplicate {

	public static void main(String[] args) {

		String str = "malayalam";
		findDuplicateFromString(str); // optimal
		findDuplicateFromString1(str);
	}

	// optimal
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
	}
}
