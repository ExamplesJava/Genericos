package com.lagm.example3.clases_genericas;

public class Pila<E> {
	private final int size;
	private int top;
	private E[] items;
	
	public Pila() {
		this(10);
	}
	
	public Pila(int size) {
		this.size = size > 0 ? size : 10;
		top = -1;
		
		this.items = (E[])new Object[size];
	}
	
	public void push(E item) {
		if (top == size - 1) {
			throw new FullStackException(String.format(
					"La pila está llena, no se puede meter %s", item));
		}
		this.items[++top] = item;
	}
	
	public E pop() {
		if (top == -1) {
			throw new EmptyStackException("La pila está vacía, no se puede sacar ningún elemento");
		}
		
		return this.items[top--];
	}
}
