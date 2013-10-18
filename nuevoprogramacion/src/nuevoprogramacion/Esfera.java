package nuevoprogramacion;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
		float radio,volumen;
		float pi;
		pi=(float)Math.PI;
		System.out.println("introduce el radio: ");
		radio=teclado.nextFloat();
		//volumen=((4/3)*(radio*radio*radio));
		volumen=(float) ((4/3) * (pi) * (Math.pow(radio, 3)));
		
		System.out.println(" volumen: "+volumen);
		
}
}