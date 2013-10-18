package nuevoprogramacion;

import java.util.Scanner;

public class Onzas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		double onzas,kilos;
		
		System.out.println("introduce los kilos: ");
		kilos=teclado.nextDouble();
		onzas=kilos * 35.2739619;
		System.out.println("este es tu peso en onzas: "+onzas);
		
		
	}

}
