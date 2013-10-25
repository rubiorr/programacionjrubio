package nuevoprogramacion;

public class LibroCalificaciones {
	
	private String nombreDelCurso;
	
	public void establecerNombreDelCurso(String nombre)
	{
		nombreDelCurso = nombre;
	}
		
		public String obtenerNombreDelCurso()
		
		{
			return nombreDelCurso;
			
		}
		
		public void mostrarMensaje()
		{
			
			System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n",
					obtenerNombreDelCurso());
		}

			
		}

