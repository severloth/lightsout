package lightsout;
import java.awt.Color;

public class JuegoModel {
	
	public JuegoModel() {}
	
	public boolean switchEstado(Button b) {
		if(b.getEstado()) {
			b.setEstado(false);
			return false;
		}
		else {
			b.setEstado(true);
			return true;
		}
	}
	
	public void randomizarEstados() {
		
	}

}
