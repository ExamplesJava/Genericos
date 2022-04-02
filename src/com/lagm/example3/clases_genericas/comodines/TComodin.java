package com.lagm.example3.clases_genericas.comodines;

import java.util.ArrayList;

public class TComodin {
	public static void main(String[] args) {
		testArrayInteger();
		testArrayDouble();
		testArrayNumbers();
	}
	
	public static void testArrayInteger() {
		Integer[] integers = {1, 2, 3, 4, 5};
		ArrayList<Integer> listIntegers = new ArrayList<>();
		
		for (Integer item : integers) {
			listIntegers.add(item);
		}
		
		System.out.printf("listIntegers contiene %s\n", listIntegers);
		System.out.printf("Total de elementos en listIntegers: %.1f\n", sumar(listIntegers));
	}
	
	public static void testArrayDouble() {
		Double[] doubles = {1.1, 3.3, 5.5};
		ArrayList<Double> listDoubles = new ArrayList<>();
		
		for (Double item : doubles) {
			listDoubles.add(item);
		}
		
		System.out.printf("\nlistDoubles contiene %s\n", listDoubles);
		System.out.printf("Total de elementos en listDoubles: %.1f\n", sumar(listDoubles));
	}
	
	public static void testArrayNumbers() {
		Number[] numbers = {1, 2.4, 3, 4.1};
		ArrayList<Number> listNumbers = new ArrayList<>();
		
		for (Number item : numbers) {
			listNumbers.add(item);
		}
		
		System.out.printf("\nlistNumbers contiene %s\n", listNumbers);
		System.out.printf("Total de elementos en listNumbers: %.1f\n", sumar(listNumbers));
	}
	
	public static double sumar(ArrayList<? extends Number> list) {
		double total = 0;
		
		for (Number item : list) {
			total += item.doubleValue();
		}
		
		return total;
	}
}
