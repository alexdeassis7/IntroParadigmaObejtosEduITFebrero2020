package com.educacioit.clase1demostracion;

public class AppPrincipal {
	// Inicio de mi programa
	public static void main(String[] args) {
		// instanciamos objetos de la clase Auto

		Auto objetoAuto1 = new Auto();
		Auto ob2 = new Auto();
		Auto ob3 = new Auto();
		Auto ob4 = new Auto();
		Auto ob5 = new Auto();
		Auto ob6 = new Auto();
		Auto ob7 = new Auto();

		// mostramos el estado de los atributos del objetoAuto1
		System.out.println("***************OBJETO 1*************");
		System.out.println("aniooooooo :" + objetoAuto1.anio);
		System.out.println("cajaauto: " + objetoAuto1.cajaAuto);
		System.out.println("color: " + objetoAuto1.color);
		System.out.println("marca: " + objetoAuto1.marca);
		System.out.println("matricula :" + objetoAuto1.matricula);
		System.out.println("modelo:" + objetoAuto1.modelo);

		System.out.println("***************OBJETO 2*************");

		System.out.println("aniooooooo :" + ob2.anio);
		System.out.println("cajaauto: " + ob2.cajaAuto);
		System.out.println("color: " + ob2.color);
		System.out.println("marca: " + ob2.marca);
		System.out.println("matricula :" + ob2.matricula);
		System.out.println("modelo:" + ob2.modelo);

		System.out.println("***************OBJETO 1*************");
		// modificamos el estado de los atributos del obejtoAuto1
		objetoAuto1.anio = 2018;
		objetoAuto1.cajaAuto = true;
		objetoAuto1.color = "verde";
		objetoAuto1.marca = "chevrolet";
		objetoAuto1.modelo = "Onix";
		objetoAuto1.matricula = "ABC 145";
		System.out.println("***********************************************");
		// volvemos a mostrar el estado de los atributos del objetoAuto1
		System.out.println("aniooooooo :" + objetoAuto1.anio);
		System.out.println("cajaauto: " + objetoAuto1.cajaAuto);
		System.out.println("color: " + objetoAuto1.color);
		System.out.println("marca: " + objetoAuto1.marca);
		System.out.println("matricula :" + objetoAuto1.matricula);
		System.out.println("modelo:" + objetoAuto1.modelo);

		System.out.println("***************OBJETO 2*************");
		// modificamos el estado de los atributos del obejtoAuto1
		ob2.anio = 2019;
		ob2.cajaAuto = true;
		ob2.color = "rojo";
		ob2.marca = "audi";
		ob2.modelo = "A3";
		ob2.matricula = "EFA 115";
		System.out.println("***************OBJETO 2*************");

		System.out.println("aniooooooo :" + ob2.anio);
		System.out.println("cajaauto: " + ob2.cajaAuto);
		System.out.println("color: " + ob2.color);
		System.out.println("marca: " + ob2.marca);
		System.out.println("matricula :" + ob2.matricula);
		System.out.println("modelo:" + ob2.modelo);

	}

}
