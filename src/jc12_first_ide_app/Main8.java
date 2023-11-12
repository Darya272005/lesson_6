package jc12_first_ide_app;

public class Main8 {

	public static void main(String[] args) {

		double[] array = { -1.5, 2.1, 0.0, -4.9, 0.0 };

		int negativeCount = 0;
		int positiveCount = 0;
		int zeroCount = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				negativeCount++;
			} else if (array[i] > 0) {
				positiveCount++;
			} else {
				zeroCount++;
			}
		}

		System.out.println("Отрицательных элементов: " + negativeCount);
		System.out.println("Положительных элементов: " + positiveCount);
		System.out.println("Нулевых элементов: " + zeroCount);
	}
}
