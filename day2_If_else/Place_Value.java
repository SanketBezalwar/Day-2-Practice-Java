package day2_If_else;

import java.util.Scanner;

public class Place_Value {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter powers of 10");
		num = sc.nextInt();

		if (num == 1) {
			System.out.println("Unit");
		} else if (num == 10) {
			System.out.println("Ten");
		} else if (num == 100) {
			System.out.println("Hundred");
		} else if (num == 1000) {
			System.out.println("Thousand");
		} else if (num == 10000) {
			System.out.println("Ten Thousand");
		} else if (num == 100000) {
			System.out.println("Lakh");
		} else if (num == 1000000) {
			System.out.println("Million");
		} else if (num == 1000000000) {
			System.out.println("Billion");
		} else {
			System.out.println("Invalid number entered");
		}
	}

}
