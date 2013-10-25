package nuevoprogramacion;

import java.util.Scanner;

public class PruebaLibroCalificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
		
		System.out.printf("El nombre inicial del curso es: %sn\n\n",
				miLibroCalificaciones.obtenerNombreDelCurso());
		
		System.out.println("Escriba el nombre del curso:");
		String elNombre = entrada.nextLine();
		System.out.println();
		
		miLibroCalificaciones.mostrarMensaje();

	}

}
