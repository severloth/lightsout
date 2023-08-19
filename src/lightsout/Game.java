package lightsout;
import lightsout.GUI;

import java.awt.Color;

import lightsout.Button;

public class Game {
	
	private final Color apagado;
	private final Color encendido;
	
	public Game(Color apagado, Color encendido) {
		this.apagado = apagado;
		this.encendido = encendido;
	}
	
	void switchEstado(Button b) {
		if(b.getEstado()) {
			b.setBackground(apagado);
			b.setEstado(false);
		}
		else {
			b.setBackground(encendido);
			b.setEstado(true);
		}
	}

}
