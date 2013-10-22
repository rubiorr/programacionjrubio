package nuevoprogramacion;


import java.util.Scanner;


		public class Alumno1 {

	

	
		public String nombre;//aqui declaro el nombre que tiene que tener el alumno
		public String nombre1;
		public String nombre2;
		public String nombre4;
		public int edad;// aqui declaro la edad que en el otro programa será fija
		public int edad1;
		
		
		public void mensaje(){//cuando llame a mensaje()tiene que aparecer lo de abajo
			Scanner teclado=new Scanner(System.in);
			
			
			System.out.println("introduce tu nombre: ");//esto aparecerá cuando lo llame en el otro programa
			nombre=teclado.next();
			nombre1=teclado.next();
			nombre2=teclado.next();
			
			System.out.println("esta es vuestra edad:  ");//esto aparecerá cuando lo llame en el otro programa
			edad=teclado.nextInt();
			
			nombre4=(nombre=teclado.next());
			edad1=(edad=teclado.nextInt());
			System.out.println("este es tu nombre: " + nombre4);
			System.out.println("este es tu nombre: " + nombre1 + " y esta tu edad: " +edad1);
			System.out.println("este es tu nombre: " + nombre2 + " y esta tu edad: "+edad1);
				
			}
			
			
		
		
				
			}
		
		
