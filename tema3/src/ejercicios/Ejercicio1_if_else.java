package ejercicios;

import java.util.Scanner;

public class Ejercicio1_if_else {

	public static void main(String[] args) {

		// leer la temperatura en farenheit

		Scanner teclado = new Scanner(System.in);
		System.out
				.println("introduce la temperatura que quieres convertir a grados celsius, lo que introduzcas ser� farenheit: ");
		double temperatura = teclado.nextDouble();

		// pasar a �C

		temperatura = (temperatura - 32) / 1.8;

		// si t�<0
		if (temperatura < 0) {
			System.out.println("Temperatura: " + temperatura + "�C");
			System.out.println("AVISO: temperatura de congelaci�n.");
		} else {
			System.out.println("Temperatura: " + temperatura + "�C");
			System.out.println("no hay riesgo de congelaci�n.");
		}

		// System.out.println("esta es la temperatura en �C: "+temperatura);

	}
}
