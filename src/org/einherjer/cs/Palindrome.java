package org.einherjer.cs;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome2("arroz"));
		System.out.println(isPalindrome2("arrrra"));
		System.out.println(isPalindrome2("arrorra"));

		System.out.println(reverse("arroz"));
		
		System.out.println(reverse(1234));
		System.out.println(isPalindrome(1234));
		System.out.println(isPalindrome(12321));
	}

	// palindromo
	// http://www.growingwiththeweb.com/2014/02/determine-if-a-string-is-a-palindrome.html
	// http://articles.leetcode.com/palindrome-number

	private static boolean isPalindrome2(String s) {
		s.toLowerCase();
		s.replaceAll("[^a-z]", "");
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	private static boolean isPalindrome(String s) {
		s.toLowerCase();
		s.replaceAll("[^a-z]", "");
		for (int i = 0; i <= Math.floorDiv(s.length() - 1, 2); i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static String reverse(String s) {
		StringBuilder result = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			result.append(s.charAt(i));
		}
		return result.toString();
	}
	
	private static int reverse(int i) {
		int result = 0;
		while (i>0){
			result = result*10;
			result = result + i%10;
			i=Math.floorDiv(i, 10);
		}
		return result;
	}
	
	private static boolean isPalindrome(int i) {
		return i == reverse(i);
	}

}
