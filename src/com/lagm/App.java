package com.lagm;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Clase<String> c = new Clase<>("Hola");
		c.mostrarTipo();
		
		Clase<Integer> i = new Clase<>(25);
		i.mostrarTipo();
		
		// List<E> -> E: Element (usado por Java Collections Framework)
		
		/* HashMap<K, V> 
		 * -> K: Key
		 * -> V: Value
		 */
	}
}
