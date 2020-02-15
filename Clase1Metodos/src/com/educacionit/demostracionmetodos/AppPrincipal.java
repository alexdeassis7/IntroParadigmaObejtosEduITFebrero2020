package com.educacionit.demostracionmetodos;

public class AppPrincipal {
	public static void main(String[] args) {
		float rs = 0;
		// intanciamos un objeto de tipo calculadora
		Calculadora c1 = new Calculadora();

		// invocamos al metodo sumar del objeto c1
		rs = c1.sumar(5, 5);
		//invocamos al procedimiento de la clase calculadora
		c1.mostrarResultado(rs);
		
		rs = c1.restar(25, 3);
		c1.mostrarResultado(rs);
		
		rs = c1.multiplicar(2, 3);
		c1.mostrarResultado(rs);
	
		rs = c1.dividir(10 ,0);
		c1.mostrarResultado(rs);
		
		
	}

}
