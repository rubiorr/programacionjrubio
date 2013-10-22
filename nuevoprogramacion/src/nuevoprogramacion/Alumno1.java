package nuevoprogramacion;


import java.util.Scanner;


		public class Alumno1 {

	

	
		public String nombre;//aqui declaro el nombre que tiene que tener el alumno
		public String nombre1;
		public String nombre2;
		public String nombre4;
		public int edad;// aqui declaro la edad que en el otro programa será fija
		public int edad1;
		public int edad2;
		public float media;
		
		
		
		public void mensaje(){//cuando llame a mensaje()tiene que aparecer lo de abajo
			Scanner teclado=new Scanner(System.in);
			
			
			System.out.println("introduce tu nombre: ");//esto aparecerá cuando lo llame en el otro programa
			nombre=teclado.next();
			nombre1=teclado.next();
			nombre2=teclado.next();
			
			System.out.println("esta es vuestra edad:  ");//esto aparecerá cuando lo llame en el otro programa
			edad=teclado.nextInt();edad1=teclado.nextInt();edad2=teclado.nextInt();
			
			
			System.out.println("este es tu nombre: " + nombre + "y esta tu edad: " +edad);
			System.out.println("este es tu nombre: " + nombre1 + " y esta tu edad: " +edad1);
			System.out.println("este es tu nombre: " + nombre2 + " y esta tu edad: " +edad2);
			
			
			media=(edad1+edad2+edad)/3;
			System.out.println("esta es la media de edad: "+media);
			
			
				
			}
			
			
		
		
				
			}
		
		
