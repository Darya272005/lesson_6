package jc12_first_ide_app;

public class Main6 {

	public static void main(String[] args) {

		int[] sequence = { 1, 3, 5, 7, 9 };

		int minNumber = sequence[0];
		int maxNumber = sequence[0];

		for (int i = 1; i < sequence.length; i++) {
			if (sequence[i] < minNumber) {
				minNumber = sequence[i];
			}
			if (sequence[i] > maxNumber) {
				maxNumber = sequence[i];
			}
		}

		int axisLength = maxNumber - minNumber;
		System.out.println("Наименьшая длина числовой оси: " + axisLength);
	}
}
