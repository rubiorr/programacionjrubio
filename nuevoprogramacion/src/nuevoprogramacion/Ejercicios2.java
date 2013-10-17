package nuevoprogramacion;

import java.util.Scanner;

public class Ejercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Float numero1;
		Float numero2;
		Float suma,producto,media;
		
		
		System.out.println("mete aquí dos numeros: ");
		numero1=teclado.nextFloat();
		numero2=teclado.nextFloat();
		
		suma=numero1+numero2;
		System.out.println("la suma " +suma);
		producto=numero1*numero2;
		System.out.println("\nproducto " +producto);
		media=(numero1+numero2)/2;
		
		System.out.println("\nla media " +media);
		
		
	}
	

}
