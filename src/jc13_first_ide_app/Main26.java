package jc13_first_ide_app;

import java.util.Scanner;

public class Main26 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите нижнюю границу диапазона:");
		int m = scanner.nextInt();

		System.out.println("Введите верхнюю границу диапазона:");
		int n = scanner.nextInt();

		for (int i = m; i <= n; i++) {
			System.out.print("Делители числа " + i + ":");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(" " + j);
				}
			}
			System.out.println();
		}

		scanner.close();
	}
}
