package ejercicios.graphics;

import pictures.Picture;

public class Ejemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		x=3;
		y=34;
		Picture pic = new Picture("coche.png");
		pic.translate(x, y);
		pic.draw();

	}

}
