package anagram;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "taher";
		String str2 = "rehat";
		
		if(isAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram");
		}

	}

	private static boolean isAnagram(String str1, String str2) {
		boolean isAnagram = true;
		if (str1.length() != str2.length()) {
			isAnagram = false;
			return isAnagram;
		}

		str1 = sortString(str1);
		str2 = sortString(str2);
		
		//a e h r t
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		for (int i = 0; i < ch1.length; i++) {
			if(ch1[i]!=ch2[i]) {
				isAnagram = false;
				return isAnagram;
			}
		}

		return isAnagram;
	}

	private static String sortString(String string) {
		char[] ch = string.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}
			}
		}
		String sortedString = new String(ch);
		return sortedString;
	}

}
