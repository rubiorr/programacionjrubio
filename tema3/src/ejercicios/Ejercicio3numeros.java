package ejercicios;

import java.util.Scanner;

public class Ejercicio3numeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("introduce un numero:");
		numero1 = teclado.nextInt();
		System.out.println("introduce un numero:");
		numero2 = teclado.nextInt();
		
		if(numero1>numero2){//tambien lo podemos poner como condición numero1=>numero2, porque pordemos imprimir numero1 si es igual
			System.out.println("numero1: "+numero1+" 0"
					+ "es mayor");
			
		}else if(numero2>numero1){
			System.out.println("el numero2: "+numero2+" es mayor");
			
		}else{
			System.out.println("estos dos numeros son iguales:  "+numero1+"="+numero2);
			
		}
		
	}//simplificar el codigo, siempre hay que intentar buscar la manera de escribir menos!!!!

}
