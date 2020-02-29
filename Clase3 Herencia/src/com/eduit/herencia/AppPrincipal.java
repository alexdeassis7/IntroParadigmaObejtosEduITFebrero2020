package com.eduit.herencia;

public class AppPrincipal {

	public static void main(String[] args) {
		// instanciamos un objeto de tipo instrumento
		//InstrumentoMusical im = new InstrumentoMusical("guitarra", "mediano");
		//System.out.println(im.ejecucion(""));

		Guitarra g = new Guitarra();
		g.nombre = "guitarra acustica";
		g.tamanio = "Grande";
		g.sonido();//utilizo metodo implementado de la clase abstracta

		System.out.println(g.ejecucion("tocando la guitarra con los dedos "));

		Bajo b = new  Bajo();
		b.sonido();
		
		//Piano p = new Piano();
		//System.out.println(p.Ejecucion("ajaaj"));
		//System.out.println(p.ejecucion("metodo padre"));

	}

}