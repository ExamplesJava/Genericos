package com.lagm.example1;

import java.util.ArrayList;
import java.util.List;

public class App2 {
	public static void main(String[] args) {
		Clase2<String, Integer, String, Double> clase = new Clase2<>("Hola", 25, "Luis", 25.0);
		clase.mostrarTipo();
		
		List<Clase2<String, Integer, String, String>> lista = new ArrayList<>();
		lista.add(new Clase2<>("Hola", 25, "Luis", "Guisado"));
		
		for (Clase2<String, Integer, String, String> c : lista) {
			clase.mostrarTipo();
		}
	}
}
