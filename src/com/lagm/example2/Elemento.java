package com.lagm.example2;

public class Elemento<T> {
	private T dato;

	public Elemento() {
	}

	public Elemento(T dato) {
		this.dato = dato;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

}
