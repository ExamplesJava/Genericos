package com.lagm.example3.clases_genericas;

public class TPila {

	private double[] itemsDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
	private int[] itemsInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	
	private Pila<Double> stackDouble;
	private Pila<Integer> stackInteger;
	
	public void testPila() {
		stackDouble = new Pila<>(5);
		stackInteger = new Pila<>(10);
		
		testPushDouble();
		testPopDouble();
		testPushInteger();
		testPopInteger();
	}
	
	public void testPushDouble() {
		try {
			System.out.println("\nMetiendo elementos en pila Double");
			for (double item: itemsDouble) {
				System.out.printf("%.1f ", item);
				stackDouble.push(item);
			}
		} catch (FullStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	public void testPopDouble() {
		try {
			System.out.println("\nSacando elementos de pila Double");
			double item;
			while (true) {
				item = stackDouble.pop();
				System.out.printf("%.1f ", item);
			}
			
		} catch (EmptyStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	public void testPushInteger() {
		try {
			System.out.println("\nMetiendo elementos en pila Integer");
			for (int item: itemsInteger) {
				System.out.printf("%d ", item);
				stackInteger.push(item);
			}
		} catch (FullStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	public void testPopInteger() {
		try {
			System.out.println("\nSacando elementos de pila Integer");
			int item;
			while (true) {
				item = stackInteger.pop();
				System.out.printf("%d ", item);
			}
			
		} catch (EmptyStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TPila pila = new TPila();
		pila.testPila();
	}
}
