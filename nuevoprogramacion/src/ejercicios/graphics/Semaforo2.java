package ejercicios.graphics;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Semaforo2 {

	
		// TODO Auto-generated method stub
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			/*
			 * lo que vamos a hacer es crear variables ancho,alto,centro_x,centro_y
			 * para que no tengamos que estar calculandolo siempre, a ojo.
			 */
			int ancho,alto,centro_x,centro_y,diametro_disco;
			
			
			
			
			
			ancho=100;
			alto=300;
			centro_x=30;
		    centro_y=30;
			diametro_disco=ancho/2;

			Rectangle box = new Rectangle((centro_x-ancho)/2,(centro_y-alto)/2,ancho,alto);
			box.draw();
			box.setColor(Color.BLACK);
			box.fill();
			
			Rectangle palo= new Rectangle((centro_x-ancho)/10,(centro_y + alto)/2 ,ancho/3,alto);
			palo.draw();
			palo.setColor(Color.PINK);
			palo.fill();

			Ellipse circulo = new Ellipse(-80+ancho, -190+alto, centro_x,centro_y);
			circulo.draw();
			circulo.setColor(new Color(0,200,0));
			circulo.draw();
			circulo.fill();

			Ellipse circulo1 = new Ellipse(-80+ancho, -230+alto, centro_x, centro_y);
			circulo1.draw();
			circulo1.setColor(new Color(255,255,0));
			circulo1.draw();
			circulo1.fill();

			Ellipse circulo3 = new Ellipse(-80+ancho, -270+alto, centro_x, centro_y);
			circulo3.draw();
			circulo3.setColor(new Color(255,0,0));
			circulo3.draw();
			circulo3.fill();

			/*Thread.sleep(1000);

			circulo.translate(150, 200);
			;

			circulo3.translate(150, -200);
			;

			Thread.sleep(1000);

			circulo3.translate(0, 80);
			;
			circulo.translate(0, -80);
			;
			*/

		}

	
		}

	


	


