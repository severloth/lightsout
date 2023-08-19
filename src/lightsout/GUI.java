package lightsout;

import java.awt.EventQueue;
import lightsout.Button;
import lightsout.Game;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
	
	private Game game;


	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		Game game = new Game(new Color(219, 237, 220), new Color(0, 255, 0) );
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 984, 1023);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Button btnNewButton = new Button("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton);
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(219, 237, 220));
		btnNewButton.setBounds(10, 11, 230, 234);
		frame.getContentPane().add(btnNewButton);
		
		Button btnNewButton_1 = new Button("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_1);
			}
		});
		
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(219, 237, 220));
		btnNewButton_1.setBounds(250, 11, 230, 234);
		frame.getContentPane().add(btnNewButton_1);
		
		Button btnNewButton_2 = new Button("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_2);
			}
		});
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(219, 237, 220));
		btnNewButton_2.setBounds(490, 11, 230, 234);
		frame.getContentPane().add(btnNewButton_2);
		
		Button btnNewButton_3 = new Button("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_3);
			}
		});
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBackground(new Color(219, 237, 220));
		btnNewButton_3.setBounds(730, 11, 230, 234);
		frame.getContentPane().add(btnNewButton_3);
		
		Button btnNewButton_4 = new Button("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_4);
			}
		});
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBackground(new Color(219, 237, 220));
		btnNewButton_4.setBounds(10, 256, 230, 234);
		frame.getContentPane().add(btnNewButton_4);
		
		Button btnNewButton_5 = new Button("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_5);
			}
		});
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setBackground(new Color(219, 237, 220));
		btnNewButton_5.setBounds(250, 256, 230, 234);
		frame.getContentPane().add(btnNewButton_5);
		
		Button btnNewButton_6 = new Button("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_6);
			}
		});
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setBackground(new Color(219, 237, 220));
		btnNewButton_6.setBounds(490, 256, 230, 234);
		frame.getContentPane().add(btnNewButton_6);
		
		Button btnNewButton_7 = new Button("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_7);
			}
		});
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setBackground(new Color(219, 237, 220));
		btnNewButton_7.setBounds(730, 256, 230, 234);
		frame.getContentPane().add(btnNewButton_7);
		
		Button btnNewButton_8 = new Button("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_8);
			}
		});
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setBackground(new Color(219, 237, 220));
		btnNewButton_8.setBounds(10, 501, 230, 234);
		frame.getContentPane().add(btnNewButton_8);
		
		Button btnNewButton_9 = new Button("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_9);
			}
		});
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setBackground(new Color(219, 237, 220));
		btnNewButton_9.setBounds(250, 501, 230, 234);
		frame.getContentPane().add(btnNewButton_9);
		
		Button btnNewButton_10 = new Button("");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_10);
			}
		});
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setBackground(new Color(219, 237, 220));
		btnNewButton_10.setBounds(490, 501, 230, 234);
		frame.getContentPane().add(btnNewButton_10);
		
		Button btnNewButton_11 = new Button("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_11);
			}
		});
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setBackground(new Color(219, 237, 220));
		btnNewButton_11.setBounds(730, 501, 230, 234);
		frame.getContentPane().add(btnNewButton_11);
		
		Button btnNewButton_12 = new Button("");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_12);
			}
		});
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setBackground(new Color(219, 237, 220));
		btnNewButton_12.setForeground(new Color(0, 255, 128));
		btnNewButton_12.setBounds(10, 741, 230, 234);
		frame.getContentPane().add(btnNewButton_12);
		
		Button btnNewButton_13 = new Button("");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_13);
			}
		});
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setBackground(new Color(219, 237, 220));
		btnNewButton_13.setBounds(250, 741, 230, 234);
		frame.getContentPane().add(btnNewButton_13);
		
		Button btnNewButton_14 = new Button("");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_14);
			}
		});
		btnNewButton_14.setBorderPainted(false);
		btnNewButton_14.setBackground(new Color(219, 237, 220));
		btnNewButton_14.setBounds(490, 741, 230, 234);
		frame.getContentPane().add(btnNewButton_14);
		
		Button btnNewButton_15 = new Button("");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.switchEstado(btnNewButton_15);
			}
		});
		btnNewButton_15.setBorderPainted(false);
		btnNewButton_15.setBackground(new Color(219, 237, 220));
		btnNewButton_15.setBounds(730, 741, 230, 234);
		frame.getContentPane().add(btnNewButton_15);
	}
}
