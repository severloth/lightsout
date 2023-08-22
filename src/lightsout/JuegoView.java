package lightsout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class JuegoView {
	private JFrame frame;
	private int tamanioMatriz;
	private Button[][] matriz;
	private JPanel panel; 


	public JuegoView(/*aca va a recibir el tamaño de la matriz para hacer variable la cantidad de celdas.*/) {
		this.tamanioMatriz = 4; //define tamaño de matriz!!
		this.matriz = new Button[tamanioMatriz][tamanioMatriz];
		this.frame = new JFrame();
		this.panel = new JPanel();
		iniciarFrame();
	}

	public void iniciarMatriz() {
		for(int fila = 0; fila < this.tamanioMatriz; fila++){
	        for(int columna = 0; columna < this.tamanioMatriz; columna++){
	        	Button boton = new Button(fila, columna);
	        	boton.setBorderPainted(true);
	        	boton.setBackground(new Color(219, 237, 220));
	        	this.matriz[fila][columna] = boton;
	        	panel.add(boton);
	        }
	    }
		this.panel.setLayout(new GridLayout(tamanioMatriz, tamanioMatriz)); //cambia la estructura de vista a Grid???
		this.frame.getContentPane().add(panel); //le pego el panel al frame con los botones ya agregados.
	}

	private void iniciarFrame() {
		this.frame.setResizable(false); //si se hace mas grande el ejecutable queda horrible.
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setBackground(new Color(255, 255, 255));
		this.frame.setBounds(100, 100, 984, 1023);
	}
	
	//Hay que agregar los listeners. Después se llaman desde Presenter. Se arma un método que recibe un action listener y luego al objeto le pones ese listener.
	//De esta manera desde el presenter no interactuas con el objeto de la vista sino que usando este método le pones un listener que definiste en el presenter.
	//El listener definido en el presenter ya handlea dicha acción con métodos del presenter (que llaman al modelo, el presenter solo actualiza la vista.)
	//EJ:
	
	public void setListeners(ActionListener listener) {
		for(Component comp : panel.getComponents()){
	        	Button boton = (Button) comp;
	        	boton.addActionListener(listener);
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
}
