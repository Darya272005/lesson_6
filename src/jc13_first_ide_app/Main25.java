package jc13_first_ide_app;

import java.util.Scanner;

public class Main25 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите число:");
		int number = scanner.nextInt();

		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}

		System.out.println("Факториал числа " + number + ": " + factorial);

		scanner.close();
	}
}
