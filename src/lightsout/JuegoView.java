package lightsout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JuegoView {
	private JFrame frame;
	private Button celdaF1C1;
	private Button celdaF1C2;
	private Button celdaF1C3;
	private Button celdaF1C4;
	private Button celdaF2C1;
	private Button celdaF2C2;
	private Button celdaF2C3;
	private Button celdaF2C4;
	private Button celdaF3C1;
	private Button celdaF3C2;
	private Button celdaF3C3;
	private Button celdaF3C4;
	private Button celdaF4C1;
	private Button celdaF4C2;
	private Button celdaF4C3;
	private Button celdaF4C4;
	private ArrayList<Button> fila1;
	private ArrayList<Button> fila2;
	private ArrayList<Button> fila3;
	private ArrayList<Button> fila4;

	public JuegoView() {
		iniciarFrame();
	}

	public void iniciarFilas() {
		this.fila1 = new ArrayList<Button>();
		this.fila2 = new ArrayList<Button>();
		this.fila3 = new ArrayList<Button>();
		this.fila4 = new ArrayList<Button>();

		fila1.add(celdaF1C1);
		fila1.add(celdaF1C2);
		fila1.add(celdaF1C3);
		fila1.add(celdaF1C4);

		fila2.add(celdaF2C1);
		fila2.add(celdaF2C2);
		fila2.add(celdaF2C3);
		fila2.add(celdaF2C4);

		fila3.add(celdaF3C1);
		fila3.add(celdaF3C2);
		fila3.add(celdaF3C3);
		fila3.add(celdaF3C4);

		fila4.add(celdaF4C1);
		fila4.add(celdaF4C2);
		fila4.add(celdaF4C3);
		fila4.add(celdaF4C4);
	}

	private void iniciarFrame() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 984, 1023);
		frame.getContentPane().setLayout(null);
	}
	
	public void agregarALaVista() {
		prepararBotones(fila1);
		prepararBotones(fila2);
		prepararBotones(fila3);
		prepararBotones(fila4);
	}

	private void prepararBotones(ArrayList<Button> fila) {
		for (Button boton : fila) {
			this.frame.getContentPane().add(boton);
			boton.setBorderPainted(false);
			boton.setBackground(new Color(219, 237, 220));
		}
	}
	
	public void crearBotones() {
		this.celdaF1C1 = new Button("");
		this.celdaF1C1.setBounds(10, 11, 230, 234);
		
		this.celdaF1C2 = new Button("");
		this.celdaF1C2.setBounds(250, 11, 230, 234);
		
		this.celdaF1C3 = new Button("");
		this.celdaF1C3.setBounds(490, 11, 230, 234);
		
		this.celdaF1C4 = new Button("");
		this.celdaF1C4.setBounds(730, 11, 230, 234);
		
		this.celdaF2C1 = new Button("");
		this.celdaF2C1.setBounds(10, 256, 230, 234);
		
		this.celdaF2C2 = new Button("");
		this.celdaF2C2.setBounds(250, 256, 230, 234);
		
		this.celdaF2C3 = new Button("");
		this.celdaF2C3.setBounds(490, 256, 230, 234);
		
		this.celdaF2C4 = new Button("");
		this.celdaF2C4.setBounds(730, 256, 230, 234);
		
		this.celdaF3C1 = new Button("");
		this.celdaF3C1.setBounds(10, 501, 230, 234);
		
		this.celdaF3C2 = new Button("");
		this.celdaF3C2.setBounds(250, 501, 230, 234);
		
		this.celdaF3C3 = new Button("");
		this.celdaF3C3.setBounds(490, 501, 230, 234);
		
		this.celdaF3C4 = new Button("");
		this.celdaF3C4.setBounds(730, 501, 230, 234);
		
		this.celdaF4C1 = new Button("");
		this.celdaF4C1.setBounds(10, 741, 230, 234);
		
		this.celdaF4C2 = new Button("");
		this.celdaF4C2.setBounds(250, 741, 230, 234);
		
		this.celdaF4C3 = new Button("");
		this.celdaF4C3.setBounds(490, 741, 230, 234);
		
		this.celdaF4C4 = new Button("");
		this.celdaF4C4.setBounds(730, 741, 230, 234);
	}
	
	//Hay que agregar los listeners. Después se llaman desde Presenter. Se arma un método que recibe un action listener y luego al objeto le pones ese listener.
	//De esta manera desde el presenter no interactuas con el objeto de la vista sino que usando este método le pones un listener que definiste en el presenter.
	//El listener definido en el presenter ya handlea dicha acción con métodos del presenter (que llaman al modelo, el presenter solo actualiza la vista.)
	//EJ:
	
	public void setearListenersBotones(ActionListener listener) {
		setListenerAFila(fila1, listener);
		setListenerAFila(fila2, listener);
		setListenerAFila(fila3, listener);
		setListenerAFila(fila4, listener);
	}

	private void setListenerAFila(ArrayList<Button> fila,ActionListener listener) {
		for (Button button : fila) {
			button.addActionListener(listener);
		}
	}

	public ArrayList<Button> getFila1() {
		return fila1;
	}

	public ArrayList<Button> getFila2() {
		return fila2;
	}

	public ArrayList<Button> getFila3() {
		return fila3;
	}

	public ArrayList<Button> getFila4() {
		return fila4;
	}

	public JFrame getFrame() {
		return frame;
	}
}
