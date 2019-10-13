package dxAssessment.dxJavaAssessment;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string to be verified: ");
		String a = in.nextLine();
		StringBuffer str = new StringBuffer(a);
		StringBuffer str2 = new StringBuffer(str.reverse());
		String s2 = new String(str2);
		System.out.println("The Reversed String is: " + str2);
		if (a.equals(s2))
			System.out.println("Yes, the given string is a palindrome");
		else
			System.out.println("Sorry, the given string is not a palindrome");
	}
}
