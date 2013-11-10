package ejercicios;

import java.util.Scanner;

public class LaborableLetra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		String dia;
		
		System.out.print("escribe el nombre de un dia: ");
		dia = teclado.nextLine();
		
		switch (dia.toLowerCase()){
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("hoy es laboral porque es" + dia);
			break;
		case "sabado":
		case "domingo":
			System.out.println("hoy no es laboral porque es" + dia);
			break;
		}

	}

}
