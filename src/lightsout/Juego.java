package lightsout;

import java.awt.EventQueue;

public class Juego {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JuegoModel model = new JuegoModel();
			    JuegoView view = new JuegoView();
				view.getFrame().setVisible(true);
			    new JuegoPresenter(model, view); //no guardamos la instancia porque el constructor de JP inicia el juego
			}
		});
	}

}
