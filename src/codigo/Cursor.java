package codigo;

import java.awt.Color;

import acm.graphics.GRect;

/*
 * Autor: Daniel Hebrero
 * 
 *  La clase Cursor tiene todo el c�digo correspondiente a la nave del Arkanoid
 *  en la que rebotan las bolas
 */
public class Cursor extends GRect {

	public Cursor(double width, double height) {
		super(width, height);
		setFilled(true);
		setFillColor(Color.BLUE);
		
	}
	/*
	 * El m�todo mueveCursor va a colocar el cursor
	 * en la poscici�n X en la que est� el rat�n.
	 */
	public void mueveCursor(int eventoPosX, int anchoPantalla){
		
		if (eventoPosX + getWidth() < anchoPantalla){
			setLocation(eventoPosX, getY());
		}
		
		
	}
}
