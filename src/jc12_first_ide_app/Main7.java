package jc12_first_ide_app;

public class Main7 {

	public static void main(String[] args) {

		double[] sequence = { 1.5, 2.1, 3.7, 4.9, 2.5 };

		double Z = 3.0;

		int replacementsCount = 0;

		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] > Z) {
				sequence[i] = Z;
				replacementsCount++;
			}
		}

		System.out.println("Количество замен: " + replacementsCount);
	}
}
