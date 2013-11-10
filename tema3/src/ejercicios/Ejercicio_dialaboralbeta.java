package ejercicios;

import java.util.Scanner;

public class Ejercicio_dialaboralbeta {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String dia;
		System.out.print("dame el dia de la semana en numero: ");
		dia = teclado.nextLine();
		switch (dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("Dia laborable.");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Dia Festivo");
			break;

		}
	}

}
// dia =dia.toLowerCase(); para ponerlo en minuscula
// if (dia.equals("lunes") es como poner dia == lunes, pero no se puede porque
// el == no es para cadenas
