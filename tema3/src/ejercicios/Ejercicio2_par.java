package ejercicios;

import java.util.Scanner;

public class Ejercicio2_par {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		System.out.println("escribe un n�mero: ");
		int numero=teclado.nextInt();
				
		
		if(numero%2 == 0) {
			System.out.printf("el n�mero %d es par",numero);
			//System.out.println("el numero "+numero+"el par");
			
		}else if(numero%2 == 1){
			System.out.printf("el n�mero %d es impar",numero);
			
		}
		
	}

}
