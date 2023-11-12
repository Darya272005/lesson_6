package jc13_first_ide_app;

import java.util.Scanner;

public class Main28 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		boolean running = true;
		
		double result = 0; 
		
		while (running) {
			System.out.println("Введите первый операнд:");
			
			double operand1 = scanner.nextDouble();
			
			System.out.println("Введите второй операнд:");
			
			double operand2 = scanner.nextDouble();
			
			System.out.println("Введите операцию (+, -, *, /):");
			
			char operation = scanner.next().charAt(0);

			switch (operation) {
			case '+':
				result = operand1 + operand2;
				break;
			case '-':
				result = operand1 - operand2;
				break;
			case '*':
				result = operand1 * operand2;
				break;
			case '/':
				result = operand1 / operand2;
				break;
			default:
				System.out.println("Неверная операция.");
				continue;
			}

			System.out.println("Результат: " + result);
			
			System.out.println("Хотите продолжить? (да/нет)");
			
			String choice = scanner.next();
			
			if (choice.equalsIgnoreCase("нет")) {
				running = false;
			}
		}
		scanner.close();
	}
}
