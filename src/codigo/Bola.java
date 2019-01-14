/*
 * Autor: Daniel Hebrero
 *	
 * La clase bola va a almacenar todas las propiedades y los métodos de la bola
 * 
 */


package codigo;

import java.awt.Color;

import acm.graphics.GObject;
import acm.graphics.GOval;


public class Bola extends GOval{
	
	public Bola(double width, double height) {
		super(width, height);
		
		setFilled(true);
		setFillColor(Color.GREEN);
	}
	
	
	
	int dx = 1; //Controla el movimiento en el eje X
	int dy = 1;	//Controla el movimiento en el eje Y
	
	
	
	
	public void muevete(Arkanoid a){
		
		//La variable a apunta a la pantalla principal del juego
		//y nos va a permitir saber el ancho y el alto de la pantalla
		//chequea el rebote contra el suelo y el techo
		if (getY() >= a.getHeight() || getY() < 0){
			dy = dy * -1; //dy *= -1;
		}
		//Chequea el rebote contra la pared derecha y la izquierda
		if (getX() >= a.getWidth() || getX() < 0){
			dx = dx *-1; //dy *= -1;
		}
		if (chequeaColision (getX(), getY(), a)){ //Chequea la esquina superior izquierda
			if (chequeaColision (getX() + getWidth(), getY(), a)){ //Chequea la esquina superior derecha
				if (chequeaColision (getX(), getY() + getHeight(), a)){ //Chequea la esquina inferior
					if (chequeaColision (getX() + getWidth(), getY() + getHeight(), a)){ //Chequea la esquina inferior
						
					}
				}
			}
		}
		move(dx,dy);
	}
	
	private boolean chequeaColision(double posX, double posY, Arkanoid ark){
		boolean noHaChocado = true;
		GObject auxiliar = ark.getElementAt(posX, posY);
		//Pregunto al auxiliar si es de tipo cursor
		if (auxiliar instanceof Cursor){
			dy = dy * -1;
			noHaChocado = false;
		}
		//Pregunto al auxiliar si es de tipo cursor
		if (auxiliar instanceof Ladrillo){
		//	if (auxiliar.getY() == posyY || auxiliar)
			dy = dy * -1;
			
			ark.remove(auxiliar);
			noHaChocado = false;
		}
		
		return noHaChocado;
	}
}
