package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Introduccion extends JPanel{
	private Inicio inicio;
	/**
	 * Create the application.
	 */
	public Introduccion( Inicio inicio) {
		this.inicio=inicio;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void paintComponent(Graphics g )  {
		Dimension tamaño = this.getSize();
		ImageIcon fondo = new ImageIcon (new ImageIcon (getClass().getResource("/Imagenes/Fondo.jpg")).getImage());
		g.drawImage(fondo.getImage(),0, 0,tamaño.width,tamaño.height,this);
	}
	
	
	private void initialize() {
		this.setFont(new Font("Monotype Corsiva", Font.BOLD, 40));
		this.setBackground(Color.CYAN);
		this.setLayout(null);
		JLabel lblNewLabel = new JLabel("Bienvenidos!");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 90));
		lblNewLabel.setBounds(275, 84, 603, 85);
		this.add(lblNewLabel);
		this.setBounds(100, 100, 985, 657);
		this.setFont(new Font("Monotype Corsiva", Font.BOLD, 70));
		this.setBackground(Color.CYAN);
		this.setLayout(null);
		JLabel lblNewLabel2 = new JLabel("Con juegoDSSB, jugando, podrás, entre otras");
		lblNewLabel2.setForeground(new Color(0, 0, 0));
		lblNewLabel2.setFont(new Font("Monotype Corsiva", Font.BOLD, 32));
		lblNewLabel2.setBounds(200, 190, 605, 32);
		this.add(lblNewLabel2);
		this.setBounds(104, 104, 988, 658);
		//
		JLabel lblNewLabel3 = new JLabel("cosas,  entrenarte en convertir un número ");
		lblNewLabel3.setForeground(new Color(0, 0, 0));
		lblNewLabel3.setFont(new Font("Monotype Corsiva", Font.BOLD, 32));
		lblNewLabel3.setBounds(200, 220, 605, 32);
		this.add(lblNewLabel3);
		this.setBounds(104, 104, 988, 658);
		//
		JLabel lblNewLabel4 = new JLabel("binario, en un número decimal.");
		lblNewLabel4.setForeground(new Color(0, 0, 0));
		lblNewLabel4.setFont(new Font("Monotype Corsiva", Font.BOLD, 32));
		lblNewLabel4.setBounds(200, 250, 605, 32);
		this.add(lblNewLabel4);
		this.setBounds(104, 104, 988, 658);
		//
		JLabel lblNewLabel5 = new JLabel("Por ejemplo: dado el número ");
		lblNewLabel5.setForeground(new Color(0, 0, 0));
		lblNewLabel5.setFont(new Font("Monotype Corsiva", Font.BOLD, 32));
		lblNewLabel5.setBounds(200, 280, 605, 32);
		this.add(lblNewLabel5);
		this.setBounds(104, 104, 988, 658);
		//
		JLabel lblNewLabel6 = new JLabel("binario 10010 para convertirlo en  decimal, ");
		lblNewLabel6.setForeground(new Color(0, 0, 0));
		lblNewLabel6.setFont(new Font("Monotype Corsiva", Font.BOLD, 32));
		lblNewLabel6.setBounds(200, 310, 605, 32);
		this.add(lblNewLabel6);
		this.setBounds(104, 104, 988, 658);
		//
		JLabel lblNewLabel7 = new JLabel("se obtiene la sumatoria:");
		lblNewLabel7.setForeground(new Color(0, 0, 0));
		lblNewLabel7.setFont(new Font("Monotype Corsiva", Font.BOLD, 32));
		lblNewLabel7.setBounds(200, 340, 605, 32);
		this.add(lblNewLabel7);
		this.setBounds(104, 104, 988, 658);
		//
		JLabel lblNewLabel8 = new JLabel("1*2^4 + 0*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 16 + 2");
		lblNewLabel8.setForeground(new Color(0, 0, 0));
		lblNewLabel8.setFont(new Font("Monotype Corsiva", Font.BOLD, 26));
		lblNewLabel8.setBounds(200, 370, 605, 32);
		this.add(lblNewLabel8);
		this.setBounds(104, 104, 988, 658);
		//
		JLabel lblNewLabel9 = new JLabel("10010 =  18 en base 10.");
		lblNewLabel9.setForeground(new Color(0, 0, 0));
		lblNewLabel9.setFont(new Font("Monotype Corsiva", Font.BOLD, 32));
		lblNewLabel9.setBounds(320, 410, 311, 32);
		this.add(lblNewLabel9);
		this.setBounds(104, 104, 988, 658);
		
		JButton btnComenzarAJugar = new JButton("Comenzar a jugar");
		btnComenzarAJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	inicio.getControlador().inicializar();
			//	inicio.getControlador().setSistemaVista(sistemaVista);
			//	inicio.getJTPJuego().removeTabAt(1);
			//	inicio.getJTPJuego().setTabComponentAt(1,inicio.getSvista());
			//	inicio.getJTPJuego().insertTab("Juego", null, inicio.getSvista(),"juego", 1);
			//	inicio.getJTPJuego().addTab("Juego",null,inicio.getSvista() ,null);
				inicio.getJTPJuego().setEnabledAt(1,true);
				inicio.getJTPJuego().setSelectedIndex(1);
				inicio.getJTPJuego().setEnabledAt(0,false);
				inicio.getSvista().btnVolverALa.setVisible(false);
			}
		});
		btnComenzarAJugar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnComenzarAJugar.setForeground(Color.DARK_GRAY);
		btnComenzarAJugar.setBackground(Color.GREEN);
		btnComenzarAJugar.setBounds(395, 468, 190, 60);
		add(btnComenzarAJugar);
	
	}
}
