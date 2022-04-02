package com.lagm.example3.clases_genericas;

public class TPila2 {

	private Double[] itemsDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
	private Integer[] itemsInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	
	private Pila<Double> stackDouble;
	private Pila<Integer> stackInteger;
	
	public void testPila() {
		stackDouble = new Pila<>(5);
		stackInteger = new Pila<>(10);
		
		testPush("pilaDouble", stackDouble, itemsDouble);
		testPop("pilaDouble", stackDouble);
		testPush("pilaInteger", stackInteger, itemsInteger);
		testPop("pilaInteger", stackInteger);
	}
	
	// <T> : T es un parámetro de tipo
	public <T> void testPush(String name, Pila<T> stack, T[] items) {
		try {
			System.out.printf("\nMetiendo elementos a %s\n", name);
			for (T item: items) {
				System.out.printf("%s ", item);
				stack.push(item);
			}
		} catch (FullStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	public <T> void testPop(String name, Pila<T> stack) {
		try {
			System.out.printf("\nSacando elementos de %s\n", name);
			T item;
			while (true) {
				item = stack.pop();
				System.out.printf("%s ", item);
			}
			
		} catch (EmptyStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TPila2 pila = new TPila2();
		pila.testPila();
	}
}
