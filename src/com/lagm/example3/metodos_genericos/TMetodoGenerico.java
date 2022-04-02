package com.lagm.example3.metodos_genericos;

public class TMetodoGenerico {

	public static <E> void printArray(E[] array) {
		for (E element : array) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5, 6};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
		Character[] charArray = {'H', 'O', 'L', 'A'};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
	}
}
