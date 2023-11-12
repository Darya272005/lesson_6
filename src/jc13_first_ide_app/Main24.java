package jc13_first_ide_app;

import java.util.Scanner;

public class Main24 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		{

			System.out.println("Введите натуральное число:");
			int number = scanner.nextInt();

			int sum = 0;
			int reversedNumber = 0;

			while (number > 0) {
				int digit = number % 10;
				if (digit % 2 == 0) {
					sum += digit;
				}
				reversedNumber = reversedNumber * 10 + digit;
				number /= 10;
			}

			System.out.println("Сумма четных цифр: " + sum);
			System.out.println("Число с цифрами в обратном порядке: " + reversedNumber);

			scanner.close();
		}
	}

}
