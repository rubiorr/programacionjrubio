package ejercicios.graphics;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle uno;
		uno = new Rectangle(10, 20, 250, 75);
		uno.draw();
		uno.setColor(Color.GREEN);
		uno.fill();
		Rectangle dos;
		dos = new Rectangle(160, -80, 100, 125);
		dos.draw();
		dos.setColor(Color.BLUE);
		dos.fill();
		Ellipse un, two, tre, cua;
		two = new Ellipse(22, 90, 40, 40);
		two.draw();
		two.setColor(Color.GRAY);
		two.fill();
		un = new Ellipse(20, 90, 40, 40);
		un.draw();
		un.setColor(Color.DARK_GRAY);
		un.fill();
		tre = new Ellipse(160, 90, 40, 40);
		tre.draw();
		tre.setColor(Color.DARK_GRAY);
		tre.fill();
		
		
		
	}

}
