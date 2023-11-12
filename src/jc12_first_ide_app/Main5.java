package jc12_first_ide_app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {
		
		
		
		        int[] seq = {1, 2, 3, 4, 5}; 

		        List<Integer> evenNumbers = new ArrayList<>();

		        for (int number : seq) {
		            if (number % 2 == 0) {
		                evenNumbers.add(number);
		            }
		        }

		        if (evenNumbers.isEmpty()) {
		            System.out.println("В последовательности нет четных чисел");
		        } else {
		           
		            Integer[] evenNumbersArray = evenNumbers.toArray(new Integer[evenNumbers.size()]);
		            System.out.println("Массив четных чисел: " + Arrays.toString(evenNumbersArray));
		        }
		    
		}

	}


