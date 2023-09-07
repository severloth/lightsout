package lightsout;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Selector {
	private JFrame frame;
	private JPanel panel;
	private int tamanioSeleccionado;
	JButton botonConfirmarSeleccion;

	public Selector() {
		this.tamanioSeleccionado = 0;
		this.frame = new JFrame();
		this.panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setForeground(SystemColor.windowBorder);
		panel.setLayout(null);
		
		this.botonConfirmarSeleccion = new JButton("Comenzar juego");
		botonConfirmarSeleccion.setBackground(SystemColor.controlHighlight);
		botonConfirmarSeleccion.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		botonConfirmarSeleccion.setBounds(188, 242, 160, 22);
		panel.add(botonConfirmarSeleccion);
		
		JLabel lblNewLabel = new JLabel("LightsOut");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
		lblNewLabel.setBounds(190, 0, 155, 72);
		panel.add(lblNewLabel);
		
		JButton botoncuatro = crearBoton("4 x 4", 4);
		botoncuatro.setBounds(80, 120, 125, 80);
		panel.add(botoncuatro);
		
		JButton botoncinco = crearBoton("5 x 5", 5);
		botoncinco.setBounds(210, 120, 125, 80);
		panel.add(botoncinco);
		
		JButton botonseis = crearBoton("7 x 7", 7);
		botonseis.setBounds(340, 120, 125, 80);
		panel.add(botonseis);
		
		JLabel lblNewLabel_1 = new JLabel("Elegir tama\u00F1o del tablero");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(193, 83, 155, 14);
		panel.add(lblNewLabel_1);
		
		this.initialize();
	}
	
	private void initialize() {
		this.frame.setResizable(true);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setBackground(new Color(255, 255, 255));
		this.frame.setBounds(300, 100, 550, 350);;
		
		this.frame.getContentPane().add(panel);
	}
	
	public JButton crearBoton(String texto, int tamanio) {
		JButton boton = new JButton(texto);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTamanioSeleccionado(tamanio);
				JButton boton = (JButton) e.getSource();
				actualizarSeleccion(boton);
			}			
		});
		boton.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		boton.setBackground(Color.decode(ColorEstado.APAGADO.getHexa()));
		return boton;
	}
		
	private void actualizarSeleccion(JButton botonSeleccionado) {
		for(Component comp : this.panel.getComponents()) {
			if(comp.equals(botonSeleccionado)) {
				comp.setBackground(Color.decode(ColorEstado.ENCENDIDO.getHexa()));
			}
			else {
				comp.setBackground(Color.decode(ColorEstado.APAGADO.getHexa()));
			}
		}
		
	}
	
	public void setTamanioSeleccionado(int nuevoTS) {
		this.tamanioSeleccionado = nuevoTS;
	}
	
	public int getTamanioElegido() {
		return this.tamanioSeleccionado;
	}
	
	public JButton getBotonConfirmarSeleccion() {
		return botonConfirmarSeleccion;
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
