package day2_While_Loop;

import java.util.Scanner;

public class Natural_Numbers {

	public static void main(String[] args) {
		int num;
		int i = 1;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times you want to add natural numbers");
		num = sc.nextInt();

		while (i <= num) {
			sum += i;
			i++;
		}
		System.out.println("Sum = " + sum);
	}

}
