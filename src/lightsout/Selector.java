package lightsout;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Selector {
	private JFrame frame;
	private JPanel panel;
	private int tamanioSeleccionado;
	JButton botonConfirmarSeleccion;

	public Selector() {
		this.tamanioSeleccionado = 0;
		this.frame = new JFrame();
		this.panel = new JPanel(new GridLayout(1, 3));
		
		this.initialize();
	}
	
	private void initialize() {
		this.frame.setResizable(true);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setBackground(new Color(255, 255, 255));
		this.frame.setBounds(100, 100, 1000, 310);
		
		JButton botonCuatro = crearBoton("4 x 4", 4);
		JButton botonCinco = crearBoton("5 x 5", 5);
		JButton botonSiete = crearBoton("7 x 7", 7);
		
		panel.add(botonCuatro);
		panel.add(botonCinco);
		panel.add(botonSiete);;
		
		this.frame.getContentPane().add(panel);
		
		this.botonConfirmarSeleccion = new JButton("Confirmar tamaño");
		frame.getContentPane().add(botonConfirmarSeleccion, BorderLayout.SOUTH);
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
		boton.setBorderPainted(false);
		boton.setBackground(Color.decode(ColorEstado.APAGADO.getHexa()));
		boton.setBounds(250, 11, 230, 234);
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
