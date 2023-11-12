package jc13_first_ide_app;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main31 {

	public static void main(String[] args) {

		Random random = new Random();
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int number = random.nextInt(15) + 1;
			numbers.add(number);
		}

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> guessedNumbers = new ArrayList<>();
		ArrayList<Integer> incorrectNumbers = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.print("Введите число: ");
			int guess = scanner.nextInt();

			if (numbers.contains(guess)) {
				guessedNumbers.add(guess);
			} else {
				incorrectNumbers.add(guess);
			}
		}
		scanner.close();

	}

}
