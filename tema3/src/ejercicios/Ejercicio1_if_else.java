package ejercicios;

import java.util.Scanner;

public class Ejercicio1_if_else {

	public static void main(String[] args) {

		// leer la temperatura en farenheit

		Scanner teclado = new Scanner(System.in);
		System.out
				.println("introduce la temperatura que quieres convertir a grados celsius, lo que introduzcas será farenheit: ");
		double temperatura = teclado.nextDouble();

		// pasar a ºC

		temperatura = (temperatura - 32) / 1.8;

		// si tº<0
		if (temperatura < 0) {
			System.out.println("Temperatura: " + temperatura + "ºC");
			System.out.println("AVISO: temperatura de congelación.");
		} else {
			System.out.println("Temperatura: " + temperatura + "ºC");
			System.out.println("no hay riesgo de congelación.");
		}

		// System.out.println("esta es la temperatura en ºC: "+temperatura);

	}
}
