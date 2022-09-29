package day2_For_Loop;

import java.util.Scanner;

public class Reverse_Integer {

	public static void main(String[] args) {
		int i;
		int rev_num = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer");
		i = sc.nextInt();

		for (; i != 0; i = i / 10) {
			rev_num = (rev_num * 10) + i % 10;
		}
		System.out.println("Reverse number is " + rev_num);
	}
}
