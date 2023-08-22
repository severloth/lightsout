package lightsout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JuegoPresenter {
	
	public enum ColorEstado {
		APAGADO("#DBEDDC"),
		ENCENDIDO("#00FF00");
		
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
		view.crearBotones();
		view.iniciarFilas();
		view.agregarALaVista();
		
		view.setearListenersBotones(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//"Como le paso el boton ??????????????????????????"
				switchEstado((Button)e.getSource());
			}
		});
	}
	
	private void switchEstado(Button b) {
		actualizarColor(b);
		model.switchEstado(b);
	}

	private void randomizarEstados(/*filas*/) {
		//le pasas al model las filas de botones y randomiza
	}
	
	private void actualizarColor(Button b) {
		if(b.getEstado()) 
		{
			b.setBackground(Color.decode(ColorEstado.APAGADO.getHexa())); 
		}
		else 
		{ 
			b.setBackground(Color.decode(ColorEstado.ENCENDIDO.getHexa())); 
		}
	}
		
}
