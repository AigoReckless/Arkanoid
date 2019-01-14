package codigo;

import java.awt.Color;
import acm.graphics.GRect;

public class Ladrillo extends GRect {

	public Ladrillo(double width, double height) {
		super(width, height);
		
	}
	
	public Ladrillo(int posX, int posY, double width, double height, Color c){
		super(posX, posY, width, height);
		setFilled(true);
		setFillColor(c);
	}

}
