package nuevoprogramacion;

import java.util.Scanner;

public class Bytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);  //1Mbps=1000000b/s
												//1Mbyte=1*1024*1024*8bits
		
		double tamaño;
		double velocidad;
		double tiempo;
		
		
		System.out.println("introduce el tamaño en Mbytes: ");
		tamaño=teclado.nextDouble();
		
		System.out.println("introduce es la velocidad en Mbps: ");
		velocidad=teclado.nextDouble();
		
		tamaño= tamaño*1024*1024*8;
		velocidad=velocidad*1000000;
		
		System.out.println("Datos: " +tamaño+ "bits");
		System.out.println("\nVelocidad: " +velocidad+ " bps");
		System.out.println("Tiempo para transmitir: "+tamaño/velocidad+ " b/s");
		
		
		

	}

}
