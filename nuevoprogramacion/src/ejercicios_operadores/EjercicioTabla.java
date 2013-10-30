package ejercicios_operadores;

public class EjercicioTabla {
	public static void main(String[] args) {
	
/*		

a	b	a and b	a or b	not a	not b
3>5	12!=8	false	true	...	
5>=6	3!=3	...			
-7=8	22				
21!=12	true				
4=2	7>=-9				
*/
	boolean a,b; 
	
	System.out.println("a\tb\ta and b\ta or b\tnot a\tnot b");
	
	a=(3>5);
	b=(12!=8);
	System.out.print("(3>5)\t12!=8\t"+(a && b));
	System.out.print("\t");
	System.out.print(a || b);
	System.out.print("\t");
	System.out.print(!a);
	System.out.print("\t");
	System.out.print(!b);
// y así con todos lo valores de la tabla

	
	}

}
