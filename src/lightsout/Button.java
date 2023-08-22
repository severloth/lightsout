package lightsout;

import javax.swing.JButton;

public class Button extends JButton {
	
	private boolean estado;
	
	private int indFila;
	
	private int indColumna;
	
	public Button(int fila, int columna) {
		super("");
		this.estado = false; //esto se tiene que randomizar!!!
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
}
