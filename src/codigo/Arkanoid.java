/*
 * Autor: Daniel Hebrero
 * 
 * Esta va a ser la clase principal del juego, que llamará al resto de 
 * las clases segun las necesitemos
 * 
 */
package codigo;




import java.awt.Color;
import java.awt.event.*;

public class Arkanoid extends acm.program.GraphicsProgram {

	Bola bola;
	Cursor cursor;
	int anchoLadrillo = 35;
	int altoLadrillo = 15;
	int numeroDeLadrillos = 14;
	
	public void init() {
		
		bola = new Bola (20, 20);
		add(bola);
		
		cursor = new Cursor (60, 10);
		add(cursor, 0, getHeight() - 200);
		addMouseListeners();
	}
	
	public void run() {
		//bucle muy basico del juego
		creaPiramide();
		while (true){
			
			bola.muevete (this);	
			pause (5);
		}
		
		
	}
	
	public void mouseMoved (MouseEvent evento){
		cursor.mueveCursor(evento.getX(), getWidth());
		
		
	}
	
	private void creaPiramide(){
		int desplazamientoInicial = (getWidth() - numeroDeLadrillos * anchoLadrillo)/2;
		for (int j=0; j < numeroDeLadrillos; j++){
			for (int i=j; i < numeroDeLadrillos; i++){
				Ladrillo miLadrillo = new Ladrillo(desplazamientoInicial + anchoLadrillo*i - anchoLadrillo/2*j,
													altoLadrillo*j + altoLadrillo,
													anchoLadrillo,
													altoLadrillo,
													Color.BLUE);
				add(miLadrillo);
			}
		}
	}
}
