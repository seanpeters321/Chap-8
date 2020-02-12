package hw_1;

import java.util.Scanner;

public class PalindromeTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;
		
		
		System.out.println("Enter a word to test: ");
		word = scan.next();
		if(word.contains(Reverse(word)))
			System.out.println("This word is a palindrome!");
		else
			System.out.println("This word is not a palindrome!");
	}
	
	public static String Reverse(String word) {
		int l = word.length() - 1;
		String s = "";
		
		if(l >= 0) {
			s += word.charAt(l) + Reverse(word.substring(0, l));
			
			return s;
		}else
			s = "";
		return s;
	}
}
