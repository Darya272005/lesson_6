package jc12_first_ide_app;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {

		int[] sequence = { 1, 0, 3, 0, 5, 0, 7, 8, 0, 10 };

		List<Integer> zeroIndexes = new ArrayList<>();

		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] == 0) {
				zeroIndexes.add(i);
			}
		}

		int[] zeroIndexesArray = new int[zeroIndexes.size()];
		for (int i = 0; i < zeroIndexes.size(); i++) {
			zeroIndexesArray[i] = zeroIndexes.get(i);
		}

		for (int index : zeroIndexesArray) {
			System.out.println(index);
		}
	}
}
