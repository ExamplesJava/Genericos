package com.lagm.example3.clases_genericas.comodines;

import java.util.ArrayList;

public class TotalNumeros {
	public static void main(String[] args) {
		Number[] numbers = {1, 2.4, 3, 4.1};
		ArrayList<Number> listNumbers = new ArrayList<>();
		
		for (Number item : numbers) {
			listNumbers.add(item);
		}
		
		System.out.printf("listNumbers contiene %s\n", listNumbers);
		System.out.printf("Total de elementos en listNumbers: %.1f\n", sumar(listNumbers));
	}
	
	public static double sumar(ArrayList<Number> list) {
		double total = 0;
		
		for (Number item : list) {
			total += item.doubleValue();
		}
		
		return total;
	}
}
