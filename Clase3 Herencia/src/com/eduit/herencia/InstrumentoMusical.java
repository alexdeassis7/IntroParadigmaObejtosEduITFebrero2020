package com.eduit.herencia;

//Clase Padre Abstracta
public abstract class InstrumentoMusical {
	// atributos
	public String nombre;
	public String tamanio;
	
	
	//DEFINIMOS UN METODO ABSTRACTO (NO TIENE CUERPO )
	public abstract void sonido();

	// metodos De la clase padre

	public String ejecucion(String modoDeEjecucion) {
		return "Estoy tocando un instrumento musical";
	}

	// metodo constructor VACIO
	public InstrumentoMusical() {

	}

	// metodo constructor SOBRECARGADO con dos parametros
	public InstrumentoMusical(String name, String size) {
		tamanio = size;
		nombre = name;

	}


	public String toString() {
		return "InstrumentoMusical [nombre=" + nombre + ", tamanio=" + tamanio + "]";
	}
	
	
	

}
