package ejercicios_operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			/*
			 
			( -5 ** 2 + 10 ) * 3
			35.3 - 53 / 10 
			1 + 5 % 1.5 * 8 / 2
			- ( (-2) ** 5 + 18 / 5 )
			65 / 3 / 4.0 * 3
			44 % 10 + 7 - 25 ** 10 -2 
			4.0 / 10.0 + 3.5 * 2
			10 % 4 + 6 / 2
			abs(4-20/3) ** 3
			sqrt(4.5 - 5.0) + 7 * 3
			3 * 10 / 3 + 10 % 3
			3L ** 3
			((36.0 / 4) + (5 * 3))
			((28 / 7) * 2)
			(13 * 3) % 10
			2**(3**3)	

			*/
					System.out.println(
						"\n ( -5 ** 2 + 10 ) * 3 = " + (( Math.pow(-5, 2) + 10 ) * 3)
						+"\n\n 35.3 - 53 / 10  = " + (35.3-53/10)
						+"\n\t>> (53 / 10)  = int:" + (53/10)
						+"\n\t>> 35.3 - (53 / 10)  = double:" + (35.3-(53/10))
						+"\n\n 1 + 5 % 1.5 * 8 / 2 = " + (1 + 5 % 1.5 * 8 / 2)
						+"\n\t>> (5 % 1.5) = double:" + (5 % 1.5)
						+"\n\t>> 1 + (((5 % 1.5) * 8) / 2) = double:" + (1 + (((5 % 1.5) * 8) / 2))
						+"\n\n - ( (-2) ** 5 + 18 / 5 ) = " + ( -( Math.pow(-2, 5) + 18 / 5 ))
						+"\n\n 65 / 3 / 4.0 * 3 = " + (65 / 3 / 4.0 * 3)
						+"\n\t (65 / 3) = int:" + (65 / 3)
						+"\n\t (((65 / 3) / 4.0) * 3) = double:" + (((65 / 3) / 4.0) * 3)
						+"\n\n 44 % 10 + 7 - 25 ** 10 -2  = " + (44 % 10 + 7 - Math.pow(25, 10) -2)
						+"\n\t (44 % 10) = int:" + (44 % 10)
						+"\n\t (44 % 10) + 7 - (25 ** 10) -2  = double:" + ((44 % 10) + 7 - Math.pow(25, 10) -2)
						+"\n\n 4.0 / 10.0 + 3.5 * 2 = " + (4.0 / 10.0 + 3.5 * 2)
						+"\n\n 10 % 4 + 6 / 2 = " + (10 % 4 + 6 / 2)
						+"\n\n abs(4-20/3) ** 3 = " + (Math.pow(Math.abs(4-20/3),3))
						+"\n\n sqrt(4.5 - 5.0) + 7 * 3 = " + (Math.sqrt(4.5 - 5.0) + 7 * 3)
						+"\n\t sqrt(4.5 - 5.0) = NotaNumber:" + (Math.sqrt(4.5 - 5.0))
						+"\n\n 3 * 10 / 3 + 10 % 3 = " + (3 * 10 / 3 + 10 % 3)
						+"\n\n 3L ** 3 = " + (Math.pow(3L,3))
						+"\n\n ((36.0 / 4) + (5 * 3)) = " + ((36.0 / 4) + (5 * 3))
						+"\n\n ((28 / 7) * 2) = " + ((28 / 7) * 2)
						+"\n\n (13 * 3) % 10 = " + ((13 * 3) % 10)
						+"\n\n 2**(3**3) = " + (Math.pow(2,Math.pow(3, 3))));
				}

			


	}


