package ejercicios.graphics;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Car {

	public static void main(String[] args) throws InterruptedException {
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
		
		//para mover el vehiculo
		/*utilizamos el translate para cada objeto creado, tengo que probarlo
		 * uno.translate(5,0); esta sería el codigo para todo. y con el thread.sleep(500); el numero es variable, aceleramos o 
		 * ralentizamos el movimiento.
		 * 
		 */
		Thread.sleep(500);
		uno.translate(5,0);
		dos.translate(5,0);
		two.translate(5,0);
		un.translate(5,0);
		tre.translate(5,0);
		Thread.sleep(500);
		uno.translate(5,0);
		dos.translate(5,0);
		two.translate(5,0);
		un.translate(5,0);
		tre.translate(5,0);
		Thread.sleep(500);
		uno.translate(5,0);
		dos.translate(5,0);
		two.translate(5,0);
		un.translate(5,0);
		tre.translate(5,0);
	}

}
