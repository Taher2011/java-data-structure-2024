package palindrome;

public class Palindrome {

	public static void main(String[] args) {

		String str = "Malayalam";

		if (isPalindrome(str)) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}

	}

	private static boolean isPalindrome(String str) {
		char[] ch = str.toLowerCase().toCharArray();
		for (int i = 0, j = ch.length - 1; i < ch.length; i++, j--) {
			if (ch[i] != ch[j]) {
				return false;
			}
		}
		return true;
	}

}
