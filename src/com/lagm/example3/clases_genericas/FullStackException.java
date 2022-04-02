package com.lagm.example3.clases_genericas;

public class FullStackException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public FullStackException() {
		this("La pila está llena");
	}
	
	public FullStackException(String exception) {
		super(exception);
	}
}
