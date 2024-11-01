package reverse;

public class ReverseString {

	public static void main(String[] args) {

		String string = "Taher";
		reverseString(string);

		string = "Taher is good employee";
		reverseString(string);

		reverseEachWordInString(string);
	}

	private static void reverseString(String string) {
		System.out.println("original string : " + string);
		char[] ch = string.toCharArray();
		StringBuilder reverseString = new StringBuilder();
		for (int i = ch.length - 1; i >= 0; i--) {
			reverseString = reverseString.append(ch[i]);
		}
		System.out.println("reverse string : " + reverseString);
		System.out.println();
	}

	private static void reverseEachWordInString(String string) {
		System.out.println("original string : " + string);
		String[] words = string.split(" ");
		StringBuilder reverseString = new StringBuilder();
		int counter = 0;
		for (String word : words) {
			char[] ch = word.toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				reverseString = reverseString.append(ch[i]);
			}
			counter++;
			if (counter < words.length)
				reverseString.append(" ");
		}
		System.out.println("reverse each word in string : " + reverseString);
	}

}
