package ejercicios.graphics;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Semaforo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Rectangle box = new Rectangle(30, 0, 50, 150);
		box.draw();
		box.setColor(Color.BLACK);
		box.fill();

		Ellipse circulo = new Ellipse(40, 20, 30, 30);
		circulo.draw();
		circulo.setColor(new Color(0,200,0));
		circulo.draw();
		circulo.fill();

		Ellipse circulo1 = new Ellipse(40, 60, 30, 30);
		circulo1.draw();
		circulo1.setColor(new Color(255,255,0));
		circulo1.draw();
		circulo1.fill();

		Ellipse circulo3 = new Ellipse(40, 100, 30, 30);
		circulo3.draw();
		circulo3.setColor(new Color(255,0,0));
		circulo3.draw();
		circulo3.fill();

		Thread.sleep(1000);

		circulo.translate(0, 80);
		;

		circulo3.translate(0, -80);
		;

		Thread.sleep(1000);

		circulo3.translate(0, 80);
		;
		circulo.translate(0, -80);
		;

	}

}
