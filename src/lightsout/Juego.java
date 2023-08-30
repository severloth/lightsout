package lightsout;

import java.awt.EventQueue;

public class Juego {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JuegoModel model = new JuegoModel(4);
				JuegoPresenter presenter = new JuegoPresenter(model);

				JuegoView view = new JuegoView(presenter, 4);
				presenter.setView(view);

				view.getFrame().setVisible(true);
			}
		});
	}

}
