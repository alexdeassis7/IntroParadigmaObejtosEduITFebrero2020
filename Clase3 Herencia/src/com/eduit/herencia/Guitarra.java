package com.eduit.herencia;

//clase hija de instrumentoMusical
public class Guitarra extends InstrumentoMusical {
	// metodo constructor vacio
	public Guitarra() {

	}

	// REdefinimos el comportamiento del metodo
	// "Polimorfismo con redefinicion"
	public String ejecucion(String modoDeEjecucion) {
		
		return modoDeEjecucion;
	}

	//IMPLEMENTAMOS METODO ABTRACTO DE LA CLASE ABTRACTA PADRE 
	public void sonido() {
		System.out.println("soy la implementacion de sonido abstracto en una guitarra ");
	}

}
