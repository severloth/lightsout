package lightsout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuegoPresenter {

	public enum ColorEstado {
		APAGADO("#DBEDDC"), ENCENDIDO("#00FF00");

		private String hexa;

		ColorEstado(String hexa) {
			this.hexa = hexa;
		}

		public String getHexa() {
			return hexa;
		}

	}

	private JuegoView view;
	private JuegoModel model;

	public JuegoPresenter(JuegoModel model, JuegoView view) {
		this.view = view;
		this.model = model;
		empezarJuego();
	}

	public void empezarJuego() {
		view.iniciarMatriz();

		view.setListeners(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button b = (Button) e.getSource(); //e.getSource trae el component que fue apretado. Se castea a Button para poder pasarselo al switchEstados.
				switchEstados(b);
			}
		});
	}

	private void switchEstados(Button b) {
		switchEstadoFila(b);
		switchEstadoColumna(b);
		switchEstadoBoton(b);
	}


	private void switchEstadoColumna(Button botonApretado) {
		for(int fila = 0; fila < view.getTamanioMatriz(); fila++){
			
			Button boton = view.getMatriz()[fila][botonApretado.getIndColumna()];

			
			if(!boton.equals(botonApretado)) {
				switchEstadoBoton(boton);
			}
		}
	}

	private void switchEstadoFila(Button botonApretado) { //recorre la fila y le delega el cambio de estado al model y el cambio de color se hace en esta clase.
		for(int columna = 0; columna < view.getTamanioMatriz(); columna++){ //esto es logica de negocio?? como hago esto sin pasarle la matriz al model?
																			//estaría bien que el modelo conozca la matriz y haga esto?
			
			Button boton = view.getMatriz()[botonApretado.getIndFila()][columna];
			
			if(!boton.equals(botonApretado)) {
				switchEstadoBoton(boton);
			}
			
		}
	}

	private void switchEstadoBoton(Button b) {
		actualizarColor(b);
		model.switchEstado(b);
	}

	private void randomizarEstados(/* matriz */) {
		// le pasas al model la matriz de botones y randomiza... estaría bien pasarle al model la matriz?...............
	}

	private void actualizarColor(Button b) {
		if (b.getEstado()) {
			b.setBackground(Color.decode(ColorEstado.APAGADO.getHexa()));
		} else {
			b.setBackground(Color.decode(ColorEstado.ENCENDIDO.getHexa()));
		}
	}

}
