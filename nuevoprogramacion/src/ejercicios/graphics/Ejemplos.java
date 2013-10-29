package ejercicios.graphics;

import pictures.Picture;
import graphics.Color;
import graphics.Ellipse;
import graphics.Line;
import graphics.Rectangle;
import graphics.Text;

public class Ejemplos {

	public static Text Text;
	public static double width;
	public static double height;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// //double x,y;
		// x=3;
		// y=34;
		// Picture pic = new Picture("coche.png");
		//
		// pic.draw();

		// double x1,x2,y1,y2,x,y;

		// x=100;
		// y=140;
		// x1=23;
		// x2=533;
		// y1=23;
		// y2=57;
		// Line segment = new Line(x1, y1, x2, y2);
		// segment.draw();

		// Text = new Text(x,y, "hello");
		// Text.draw();

		// int x1,y1,x2,y2;
		// x1=22;
		// y1=44;
		// x2=3;
		// y2=33;
		// Line segment =new Line(x1,y1,x2,y2);
		// segment.getX();
		// segment.getY();
		// segment.draw();

		Rectangle box = new Rectangle(10, 30,50, 15);
		box.draw();
		box.setColor(Color.BLUE);
		box.fill();
		Ellipse rueda1 = new Ellipse(12, 12, 60, 60);
		rueda1.setColor(Color.YELLOW);
		rueda1.fill();  
		Ellipse rueda2 = new Ellipse(120, 50, 120, 60);
		box.translate(120,120);
		rueda2.setColor(Color.YELLOW);
		rueda2.fill();  
		
		  
	}

}
