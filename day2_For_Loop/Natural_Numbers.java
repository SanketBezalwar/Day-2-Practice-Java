package day2_For_Loop;

import java.util.Scanner;

public class Natural_Numbers {

	public static void main(String[] args) {
		int num;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times you want to add natural numbers");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++)
			sum += i;
		System.out.println("Sum = " + sum);
	}
}