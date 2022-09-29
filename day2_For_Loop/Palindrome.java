package day2_For_Loop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String num;
		String rev = "";
		int length;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is palindrome");
		num = sc.nextLine();
		length = num.length();

		for (int i = length - 1; i >= 0; i--)
			rev = rev + num.charAt(i);

		if (num.equals(rev))
			System.out.println("The entered number is a palindrome");
		else
			System.out.println("The entered number is not a palindrome");
	}

}
