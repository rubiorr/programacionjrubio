package nuevoprogramacion;

import java.util.Scanner;

public class Bytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);  //1Mbps=1000000b/s
												//1Mbyte=1*1024*1024*8bits
		
		double tama�o;
		double velocidad;
		double tiempo;
		
		
		System.out.println("introduce el tama�o en Mbytes: ");
		tama�o=teclado.nextDouble();
		
		System.out.println("introduce es la velocidad en Mbps: ");
		velocidad=teclado.nextDouble();
		
		tama�o= tama�o*1024*1024*8;
		velocidad=velocidad*1000000;
		
		System.out.println("Datos: " +tama�o+ "bits");
		System.out.println("\nVelocidad: " +velocidad+ " bps");
		System.out.println("Tiempo para transmitir: "+tama�o/velocidad+ " b/s");
		
		
		

	}

}
