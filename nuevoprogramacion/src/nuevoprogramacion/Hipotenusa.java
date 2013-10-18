package nuevoprogramacion;

import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
		float a,b;
		double c;
		System.out.println("introduce cateto1: ");
		a=teclado.nextFloat();
		System.out.println("introduce cateto2: ");
		b=teclado.nextFloat();
		
		c=Math.sqrt((a*a+b*b));
		System.out.println("hipotenusa: "+c);

	}
	

}
