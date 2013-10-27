package ejercicios.graphics;

import graphics.Line;
import graphics.Text;

public class Ejemplos {

	public static void main(String[] args, Text Text) {
		// TODO Auto-generated method stub
//		//double x,y;
//		x=3;
//		y=34;
//		Picture pic = new Picture("coche.png");
//		
//		pic.draw();
		
		double x1,x2,y1,y2,x,y;
		x1=23;
		x2=53;
		y1=23;
		y2=23;
		x=60;
		y=60;
		Line segment = new Line(x1, y1, x2, y2);
		segment.draw();
		Text = new Text(x, y, "Hello"); 
		Text.draw();

	}

}
