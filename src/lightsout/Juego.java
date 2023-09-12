package lightsout;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Juego {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				SelectorView selector = new SelectorView();
				selector.getFrame().setVisible(true);
				
				selector.getBotonConfirmarSeleccion().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int tamanioFinal = selector.getTamanioElegido();
						
						if(tamanioFinal == 0) {
							JOptionPane.showMessageDialog(null, "Tenes que seleccionar un tamaño.", "Error.", JOptionPane.ERROR_MESSAGE);
						} else {
							selector.getFrame().dispose();
							JuegoModel model = new JuegoModel(tamanioFinal);
							JuegoPresenter presenter = new JuegoPresenter(model);
							
							JuegoView view = new JuegoView(presenter, tamanioFinal);
							presenter.setView(view);
							view.getFrame().setVisible(true);
						}
					}
				});
			}
		});
	}

}
