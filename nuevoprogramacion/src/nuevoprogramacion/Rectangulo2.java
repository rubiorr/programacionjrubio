package nuevoprogramacion;

import java.util.Scanner;

public class Rectangulo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
int x1,x2;
int y1,y2;
int resultado;
	System.out.println("valor x1 : ");
	x1=teclado.nextInt();
	System.out.println("valor x2 : ");
	x2=teclado.nextInt();
	System.out.println("valor y1 : ");
	y1=teclado.nextInt();
	System.out.println("valor y2 : ");
	y2=teclado.nextInt();
	
	resultado=(x2-x1) * (y2-y1);
	
	System.out.println("el resultado del calculo del area es: "+resultado);
	}

}
