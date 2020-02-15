package com.educacionit.demostracionmetodos;

public class Calculadora {

	// Definimos los metodos de la clase calculadora que brindan el comportamiento
	// de
	// todas las instacias

	// Funcion sumar que recibe dos enteros por parametro y retorna la sumade ambos
	public int sumar(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		return resultado;
	}

	public float restar(float num1, float num2) {
		return num1 - num2;
	}

	public int multiplicar(int n1, int n2) {
		return n1 * n2;
	}

	public float dividir(float n1, float n2) {
		float resultado = 0;
		if (n2 != 0) {
			resultado = n1 / n2;
		} else {
			System.out.println("no se puede dividir por cero en los numeros reales");
			resultado = 0;
		}
		return resultado;

	}
//procedimiento que muestra resultados!
	public void mostrarResultado(float numeroAmostrar) {
		System.out.println("El resultado obtenido es : " + numeroAmostrar);

	}

}
