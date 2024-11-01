package anagram;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "taher";
		String str2 = "rehasa";

		if (isAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram");
		}

	}

	private static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		str1 = sortString(str1);
		str2 = sortString(str2);
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		for (int i = 0, j = 0; i < ch1.length; i++, j++) {
			if (ch1[i] != ch2[j]) {
				return false;
			}
		}
		return true;
	}

	private static String sortString(String string) {
		char[] ch = string.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char temp;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return new String(ch);
	}

}
