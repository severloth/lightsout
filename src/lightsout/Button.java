package lightsout;
import java.awt.Color;

import javax.swing.JButton;

public class Button extends JButton{
	
	private boolean estado;
	
	public Button() {
		super("");
		this.estado = false;
	}

	public Button(String string) {
		super(string);
	}
	
	
	void setColor(Color color) {
		this.setBackground(color);
	}
	
	void setEstado(Boolean b) {
		this.estado = b; 
	}
	
	boolean getEstado() {
		return this.estado;
	}
}
