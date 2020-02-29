package com.eduit.herencia;

public class Bajo extends InstrumentoMusical implements IMiInterface{

	// REdefinimos el comportamiento del metodo
	// "Polimorfismo con redefinicion"
	public String ejecucion(String modoDeEjecucion) {
		
		return "estoy tocando elo bajo con los dedos";
	}


	public void sonido() {
		System.out.println("estoy emitiendo un sonido grave ");
	}


	@Override
	public void metodo() {
		
		
	}
}
