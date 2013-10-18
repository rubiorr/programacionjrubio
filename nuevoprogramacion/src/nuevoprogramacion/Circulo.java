package nuevoprogramacion;

import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
		float radio,perimetro,area;
		float pi;
		pi=(float)Math.PI;
		System.out.println("introduce el radio: ");
		radio=teclado.nextFloat();
		area=((pi)*(radio * radio));
		perimetro=(2*pi*radio);
		System.out.println(" area: "+area+ " perimetro: "+perimetro);
		
		
		
		
		

	}

}
