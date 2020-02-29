package com.eduit.herencia;

public abstract class Piano extends InstrumentoMusical {

	// REdefinimos el comportamiento del metodo
	// "Polimorfismo con redefinicion"
	public String Ejecucion(String modoDeEjecucion) {

		return "estoy tocando el piano con los dedos del pie ";
	}
	public Piano() {
		
	}

}
