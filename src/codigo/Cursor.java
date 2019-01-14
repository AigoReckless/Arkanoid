package codigo;

import java.awt.Color;

import acm.graphics.GRect;

/*
 * Autor: Daniel Hebrero
 * 
 *  La clase Cursor tiene todo el código correspondiente a la nave del Arkanoid
 *  en la que rebotan las bolas
 */
public class Cursor extends GRect {

	public Cursor(double width, double height) {
		super(width, height);
		setFilled(true);
		setFillColor(Color.BLUE);
		
	}
	/*
	 * El método mueveCursor va a colocar el cursor
	 * en la poscición X en la que esté el ratón.
	 */
	public void mueveCursor(int eventoPosX, int anchoPantalla){
		
		if (eventoPosX + getWidth() < anchoPantalla){
			setLocation(eventoPosX, getY());
		}
		
		
	}
}
