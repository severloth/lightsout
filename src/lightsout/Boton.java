package lightsout;

import javax.swing.JButton;

public class Boton extends JButton {
	
	private boolean estado;
	
	private int indFila;
	
	private int indColumna;
	
	public Boton(int fila, int columna) {
		super("");
		this.estado = false;
		this.indFila = fila;
		this.indColumna = columna;
	}
	
	public void setEstado(Boolean b) { 
		this.estado = b; 
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public int getIndFila() {
		return this.indFila;
	}
	
	public int getIndColumna() {
		return this.indColumna;
	}
	
	public void toggleEstado() {
		this.estado = !this.estado;
	}
}
