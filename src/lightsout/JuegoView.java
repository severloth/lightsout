package lightsout;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JuegoView {
	private JFrame frame;
	private int tamanioMatriz;
	private Boton[][] matriz;
	private JPanel panel; 
	private JuegoPresenter presenter;


	public JuegoView(JuegoPresenter presenter, int tamanioMatriz) {
		this.tamanioMatriz = tamanioMatriz;
		this.matriz = new Boton[tamanioMatriz][tamanioMatriz];
		this.frame = new JFrame();
		this.panel = new JPanel();
		this.presenter = presenter;
		
		initialize();
	}

	private void initialize() {
		this.frame.setSize(600, 600);
		this.frame.setResizable(false); 
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setBackground(new Color(255, 255, 255));
		this.frame.setBounds(500, 200, 700, 700);
		iniciarMatriz();
	}
	
	public void iniciarMatriz() {
		boolean[][] matrizRandom = this.presenter.darMatrizRandomizada();
		for(int fila = 0; fila < this.tamanioMatriz; fila++) {
	        for(int columna = 0; columna < this.tamanioMatriz; columna++) {
	        	Boton boton = new Boton(fila, columna);
	        	boton.setBorderPainted(true);
	        	boton.setBackground(new Color(219, 237, 220));
	        	boton.setEstado(matrizRandom[fila][columna]);
	        	actualizarColor(boton);
	        	this.matriz[fila][columna] = boton;
	        	panel.add(boton);
	        }
	    }
		this.panel.setLayout(new GridLayout(tamanioMatriz, tamanioMatriz));
		this.frame.getContentPane().add(panel);
		setListeners();
	}
	
	public void setListeners() {
		for(Component comp : panel.getComponents()) {
	        Boton boton = (Boton) comp;
	        boton.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			Boton b = (Boton) e.getSource();
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
	
	private void actualizarColor(Boton b) {
		if (b.getEstado()) {
			b.setBackground(Color.decode(ColorEstado.ENCENDIDO.getHexa()));
		} else {
			b.setBackground(Color.decode(ColorEstado.APAGADO.getHexa()));
		}
	}
	
	public void elJugadorGano() {
		dibujarPantallaGanadora();
	}
	
	private void dibujarPantallaGanadora() {
		JOptionPane.showMessageDialog(null, "Ganaste!!!", "Felicidades!", JOptionPane.PLAIN_MESSAGE);
		this.frame.dispose();
	}
	
	public JPanel getPanel() {
		return this.panel;
	}

	public JFrame getFrame() {
		return this.frame;
	}
	
	public Boton[][] getMatriz() {
		return this.matriz;
	}

	public int getTamanioMatriz() {
		return this.tamanioMatriz;
	}
	
	public void setPresenter(JuegoPresenter presenter) {
		this.presenter = presenter;
	}
}
