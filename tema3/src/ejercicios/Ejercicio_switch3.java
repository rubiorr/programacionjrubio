package ejercicios;

import java.util.Scanner;

public class Ejercicio_switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numero1,numero2;
		System.out.println("Introduce un numero: ");
		numero1=teclado.nextInt();
		System.out.println("Introduce un segundo numero: ");
		numero2=teclado.nextInt();
		String operaci�n;
		System.out.println("introduce la operaci�n que deseas realizar, solo puedes escoger estas tres: suma, resta, multiplicaci�n");
		operaci�n=teclado.nextLine();
		int suma1,resta1,multi;
		suma1=numero1+numero2;
		resta1=numero1-numero2;
		multi=numero1*numero2;
		switch(operaci�n){
		case "suma": 
			System.out.println(" la suma de "+numero1+" + "+numero2+ "es: "+suma1);
		break;
		case "resta":
			System.out.println(" la resta de "+numero1+" - "+numero2+ "es: "+resta1);
			break;
		case "multiplicaci�n":
			System.out.println(" la multiplicaci�n de "+numero1+" * "+numero2+ "es: "+multi);
			break;
		}

	}

}
