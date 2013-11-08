package ejercicios;

import java.util.Scanner;

public class Ejercicio_dia1 {
	Scanner teclado=new Scanner(System.in);
	String letra_dia;
	int numero_dia;
	System.out.println("introduce el numero de la semana en numero: ");
	numero1=teclado.nextInt();
	public static void main(String[] args) {

		switch (numero_dia){
		case 1 :letra_dia="Lunes";
		break;
		case 2: letra_dia= "Martes";
		break;
		case 3 :letra_dia="Miercoles";
		break;
		case 4: letra_dia= "Jueves";
		break;
		case 5:letra_dia="Viernes";
		break;
		case 6: letra_dia= "Sabado";
		break;
		case 7:letra_dia="Domingo";
		break;
		default;
		System.out.println("El número no esta entre [1..7}");
		
		
		}
	}

}
