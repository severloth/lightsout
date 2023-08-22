package lightsout;

import javax.swing.JButton;

public class Button extends JButton {
	
	private boolean estado;
	
	public Button() {
		super("");
		this.estado = false; //esto se tiene que randomizar!!!
	}

	public Button(String string) {
		super(string);
	}
	
	void setEstado(Boolean b) { 
		this.estado = b; 
	}
	
	boolean getEstado() {
		return this.estado;
	}
}
