package lightsout;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JuegoView {
	private JFrame frame;
	private int tamanioMatriz;
	private Button[][] matriz;
	private JPanel panel; 
	private JuegoPresenter presenter;


	public JuegoView(JuegoPresenter presenter, int tamanioMatriz) {
		this.tamanioMatriz = tamanioMatriz;
		this.matriz = new Button[tamanioMatriz][tamanioMatriz];
		this.frame = new JFrame();
		this.panel = new JPanel();
		this.presenter = presenter;
		
		initialize();
	}

	private void initialize() {
		this.frame.setResizable(false); //si se hace mas grande el ejecutable queda horrible.
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setBackground(new Color(255, 255, 255));
		this.frame.setBounds(100, 100, 984, 1023); //setear bounds segun el tamaño de pantalla (ver si se puede)
		iniciarMatriz();
	}
	
	public void iniciarMatriz() {
		boolean[][] matrizRandom = this.presenter.darMatrizRandomizada();
		for(int fila = 0; fila < this.tamanioMatriz; fila++) {
	        for(int columna = 0; columna < this.tamanioMatriz; columna++) {
	        	Button boton = new Button(fila, columna);
	        	boton.setBorderPainted(true);
	        	boton.setBackground(new Color(219, 237, 220));
	        	boton.setEstado(matrizRandom[fila][columna]); //setea los estados de los botones a los random recibidos.
	        	actualizarColor(boton);
	        	this.matriz[fila][columna] = boton;
	        	panel.add(boton);
	        }
	    }
		this.panel.setLayout(new GridLayout(tamanioMatriz, tamanioMatriz)); //cambia la estructura de vista a Grid???
		this.frame.getContentPane().add(panel); //le pego el panel al frame con los botones ya agregados.
		setListeners();
	}
	
	public void setListeners() {
		for(Component comp : panel.getComponents()) {
	        Button boton = (Button) comp;
	        boton.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			Button b = (Button) e.getSource(); //e.getSource trae el component que fue apretado. Se castea a Button para poder pasarselo al switchEstados.
	    			presenter.switchEstados(b);
	    			actualizarEstados(presenter.getEstadoMatriz());
	    		}
	    	});
	    }
	}
	
	public void actualizarEstados(boolean[][] estadosActualizados) {
		for(int fila = 0; fila < this.tamanioMatriz; fila++) {
	        for(int columna = 0; columna < this.tamanioMatriz; columna++) {
	        	this.matriz[fila][columna].setEstado(estadosActualizados[fila][columna]);
	        	actualizarColor(this.matriz[fila][columna]);
	        }
	    }
	}
	
	private void actualizarColor(Button b) {
		if (b.getEstado()) {
			b.setBackground(Color.decode(ColorEstado.APAGADO.getHexa()));
		} else {
			b.setBackground(Color.decode(ColorEstado.ENCENDIDO.getHexa()));
		}
	}
	
	public JPanel getPanel() {
		return this.panel;
	}

	public JFrame getFrame() {
		return this.frame;
	}
	
	public Button[][] getMatriz() {
		return this.matriz;
	}

	public int getTamanioMatriz() {
		return this.tamanioMatriz;
	}
	
	public void setPresenter(JuegoPresenter presenter) {
		this.presenter = presenter;
	}
}
