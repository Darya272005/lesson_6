package jc12_first_ide_app;

public class Main3 {

	public static void main(String[] args) {

		int[] sequence = { 1, -2, 3, -4, 5 };

		if (sequence.length > 0) {
			if (sequence[0] > 0) {
				System.out.println("Первое число - положительное");
			} else if (sequence[0] < 0) {
				System.out.println("Первое число - отрицательное");
			} else {
				System.out.println("Первое число равно нулю");
			}
		} else {
			System.out.println("Последовательность пуста");
		}
	}
}
