package ejercicios;

import java.util.Scanner;

public class Ejercicio3compara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("introduce un numero: ");
		num1 = teclado.nextInt();
		System.out.println("introduce un numero: ");
		num2 = teclado.nextInt();
		System.out.println("introduce un numero: ");
		num3 = teclado.nextInt(); 
		
		if (num1<=num2 && num1<=num3){
			System.out.println("número menor: "+ num1);
			
		}else if(num2<num3 ){
			System.out.println("número menor: "+ num2);
		}else{
			System.out.println("número menor: "+ num3);

		}

	}
}
