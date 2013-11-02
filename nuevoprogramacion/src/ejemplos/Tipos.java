package ejemplos;

public class Tipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ancho;
		double real=0.0;
	
		ancho = 25;
		
		//ancho= 25*0.33;  esto sería un int, pero como tenemos decimales nos los eliminaría y hacemos lo de abajo.
		
		ancho = (int)(25*0.33);
		ancho = (int)(real);//esto es otra forma de ponerlo, pero hay que declarar la variable real como double.
		
		//esto lo hacemos para la conversion del tipo int a double por ejemplo
		
		float f;
		
		f=(float)(5.0);
		
		
		
		

	}

}
