package nuevoprogramacion;

import java.util.Scanner;

public class Triangulo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner teclado =new Scanner(System.in);
		 
		float a;
		float b;
		float area;
		
	float perimetro;
		 
	a=teclado.nextFloat();
	b=teclado.nextFloat();
		 area=(2)*(a*b);
		 perimetro=(a*b);
		 
		 System.out.println("dado la base "+a+ "y la altura "+b );
		 
		 System.out.println("area: "+area);
		 System.out.println("perimetro: "+perimetro);
		 
		 
		
		 

	}

}
