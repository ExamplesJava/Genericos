package com.lagm.example3.clases_genericas;

public class EmptyStackException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EmptyStackException() {
		this("La pila está vacía");
	}
	
	public EmptyStackException(String exception) {
		super(exception);
	}
}
