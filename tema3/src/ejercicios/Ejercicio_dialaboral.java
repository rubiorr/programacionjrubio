package ejercicios;

import java.util.Scanner;

public class Ejercicio_dialaboral {

	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
int numero_dia;
System.out.println("dame el dia de la semana en numero: ");
numero_dia=teclado.nextInt();

switch (numero_dia){
case 1:
case 2:
case 3:
case 4:
case 5:
	System.out.println("Dia laborable.");
	break;
case 6:
case 7:
	System.out.println("Dia Festivo");
	break;

}
	}

}
