package lightsout;

public class JuegoPresenter {

	private JuegoView view;
	private JuegoModel model;

	public JuegoPresenter(JuegoModel model) {
		this.model = model;
	}

	public void switchEstados(Button b) {
		model.switchEstadoFila(b.getIndFila(), b.getIndColumna());
		model.switchEstadoColumna(b.getIndFila(), b.getIndColumna());
		model.switchEstadoBoton(b.getIndFila(), b.getIndColumna());
	}

	public boolean[][] darMatrizRandomizada() {
		return model.randomizarMatriz();
	}
	
	public void setView(JuegoView view) {
		this.view = view;
	}

	public boolean[][] getEstadoMatriz() {
		return model.getMatriz();
	}

}
