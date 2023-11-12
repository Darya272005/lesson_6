package jc12_first_ide_app;

public class Main9 {

	public static void main(String[] args) {

		double[] sequence = { 1.5, 2.1, 3.7, 4.9, 2.5 };

		int maxIndex = 0;
		int minIndex = 0;

		for (int i = 1; i < sequence.length; i++) {
			if (sequence[i] > sequence[maxIndex]) {
				maxIndex = i;
			}

			if (sequence[i] < sequence[minIndex]) {
				minIndex = i;
			}
		}

		double temp = sequence[maxIndex];
		sequence[maxIndex] = sequence[minIndex];
		sequence[minIndex] = temp;

		System.out.println("Измененная последовательность: " + java.util.Arrays.toString(sequence));
	}
}
