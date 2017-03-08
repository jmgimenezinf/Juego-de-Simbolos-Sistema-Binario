package Vista;
import Vista.Url;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Informacion extends JPanel{

	/**
	 * Create the application.
	 */
	

	
	public Informacion() {
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
		JLabel lblNewLabel = new JLabel("JuegoDSSB");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 70));
		lblNewLabel.setBounds(300,01, 603, 260);
		this.add(lblNewLabel);
		this.setBounds(100, 100, 985, 657);
		this.setFont(new Font("Monotype Corsiva", Font.BOLD, 70));
		this.setBackground(Color.CYAN);
		this.setLayout(null);
		JLabel lblNewLabel2 = new JLabel("Juego de símbolos, sistema binario.");
		lblNewLabel2.setForeground(new Color(0, 0, 0));
		lblNewLabel2.setFont(new Font("Monotype Corsiva", Font.BOLD, 42));
		lblNewLabel2.setBounds(130, 60, 605, 269);
		this.add(lblNewLabel2);
		this.setBounds(104, 104, 988, 658);
		//
		JLabel lblNewLabel3 = new JLabel("«link y bibliografía»");
		lblNewLabel3.setForeground(new Color(0, 0, 0));
		lblNewLabel3.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
		lblNewLabel3.setBounds(270, 100, 605, 269);
		this.add(lblNewLabel3);
		this.setBounds(104, 104, 988, 658);
		//
//		JLabel labelURL = new JLabel();
//		labelURL.setName("http://www.google.com/");
//		labelURL.setText("<html> <a href=\"\">http://www.google.com/</a></html>");
//		labelURL.setFocusable(false);
//		labelURL.setVisible(true);
//		labelURL.setEnabled(true);
//		 labelURL.setForeground(new Color(0, 0, 0));
//		 labelURL.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
//		 labelURL.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		 Url url0= new Url(labelURL);
//		 url0.goWebsite();
//	      this.add(labelURL);
//		labelURL.setBounds(90, 120, 605, 20);
		
		
		

		//
		JLabel lblNewLabel31 = new JLabel("Encontrarás más información sobre sistemas");
		lblNewLabel31.setForeground(new Color(0, 0, 0));
		lblNewLabel31.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
		lblNewLabel31.setBounds(90, 140, 605, 269);
		this.add(lblNewLabel31);
		this.setBounds(104, 104, 988, 658);
		//
		JLabel lblNewLabel4 = new JLabel("de númeracion.Conversión de binario a ");
		lblNewLabel4.setForeground(new Color(0, 0, 0));
		lblNewLabel4.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
		lblNewLabel4.setBounds(90, 160, 605, 269);
		this.add(lblNewLabel4);
		this.setBounds(104, 104, 988, 658);
		//
		JLabel lblNewLabel5 = new JLabel("decimal en las siguientes direcciones:");
		lblNewLabel5.setForeground(new Color(0, 0, 0));
		lblNewLabel5.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
		lblNewLabel5.setBounds(90, 180, 605, 269);
		this.add(lblNewLabel5);
		this.setBounds(104, 104, 988, 658);
		//
		JLabel labelURL1 = new JLabel();
		labelURL1.setName("http://www.inpahu.edu.co/tecnologias/ovasfit/sisdig02/sisdig2.html");
		labelURL1.setText("<html> <a href=\"\">http://www.inpahu.edu.co/tecnologias/ovasfit/sisdig02/sisdig2.html</a></html>");
		labelURL1.setFocusable(false);
		labelURL1.setVisible(true);
		labelURL1.setEnabled(true);
		 labelURL1.setForeground(new Color(0, 0, 0));
		 labelURL1.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		 labelURL1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 Url url1 = new Url(labelURL1);
		 url1.goWebsite();
	      this.add(labelURL1);
		labelURL1.setBounds(30, 330, 605, 20);
		this.setBounds(104, 104, 988, 658);
		
		//
//		JLabel lblNewLabel7 = new JLabel("Otros links:");
//		lblNewLabel7.setForeground(new Color(0, 0, 0));
//		lblNewLabel7.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
//		lblNewLabel7.setBounds(30, 240, 605, 269);
//		this.add(lblNewLabel7);
//		this.setBounds(104, 104, 988, 658);
		//
		JLabel labelURL2 = new JLabel();
		labelURL2.setName("http://platea.pntic.mec.es/~lgonzale/tic/binarios/numeracion.html#Sistema_de_numeraci%F3n_binario");
		labelURL2.setText("<html> <a href=\"\">http://platea.pntic.mec.es/~lgonzale/tic/binarios/numeracion</a></html>");
		labelURL2.setFocusable(false);
		labelURL2.setVisible(true);
		labelURL2.setEnabled(true);
		 labelURL2.setForeground(new Color(0, 0, 0));
		 labelURL2.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		 labelURL2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 Url url2 = new Url(labelURL2);
		 url2.goWebsite();
	      this.add(labelURL2);
		labelURL2.setBounds(30, 350, 605, 20);
		this.setBounds(104, 104, 988, 658);

		//
		JLabel labelURL3 = new JLabel();
		labelURL3.setName("http://curso-cm.speccy.org/contenido/cap2.html");
		labelURL3.setText("<html> <a href=\"\">http://curso-cm.speccy.org/contenido/cap2.html");
		labelURL3.setFocusable(false);
		labelURL3.setVisible(true);
		labelURL3.setEnabled(true);
		 labelURL3.setForeground(new Color(0, 0, 0));
		 labelURL3.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		 labelURL3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 Url url3 = new Url(labelURL3);
		 url3.goWebsite();
	      this.add(labelURL3);
		labelURL3.setBounds(30, 370, 605, 20);
		this.setBounds(104, 104, 988, 658);

		//
		
		JLabel labelURL4 = new JLabel();
		labelURL4.setName("http://www.areatecnologia.com/sistema-binario.htm");
		labelURL4.setText("<html> <a href=\"\">http://www.areatecnologia.com/sistema-binario.htm");
		labelURL4.setFocusable(false);
		labelURL4.setVisible(true);
		labelURL4.setEnabled(true);
		 labelURL4.setForeground(new Color(0, 0, 0));
		 labelURL4.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		 labelURL4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 Url url4 = new Url(labelURL4);
		 url4.goWebsite();
	      this.add(labelURL4);
		labelURL4.setBounds(30, 390, 605, 20);
		this.setBounds(104, 104, 988, 658);

		//
		
		JLabel labelURL5 = new JLabel();
		labelURL5.setName("http://www.grupoalquerque.es/ferias/2012/archivos/s-n_nuevos/s-n_base_2.pdf");
		labelURL5.setText("<html> <a href=\"\">http://www.grupoalquerque.es/ferias/2012/archivos/s-n_nuevos/s-n_base_2.pdf");
		labelURL5.setFocusable(false);
		labelURL5.setVisible(true);
		labelURL5.setEnabled(true);
		 labelURL5.setForeground(new Color(0, 0, 0));
		 labelURL5.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		 labelURL5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 Url url5 = new Url(labelURL5);
		 url5.goWebsite();
	      this.add(labelURL5);
		labelURL4.setBounds(30, 390, 605, 20);
		this.setBounds(104, 104, 988, 658);
		//
		
	
	
		
		
		
//		JLabel lblNewLabel12 = new JLabel("asar+un+numero+binario+a+decimal&source=bl&ots=1HHNA8hxnP&sig=L1pz");
//		lblNewLabel12.setForeground(new Color(0, 0, 0));
//		lblNewLabel12.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
//		lblNewLabel12.setBounds(30, 370, 605, 269);
//		this.add(lblNewLabel12);
//		this.setBounds(104, 104, 988, 658);
//		//
//		//
//		JLabel lblNewLabel13= new JLabel("niVumffSf-BE7wPIntVc&hl=es-");
//		lblNewLabel13.setForeground(new Color(0, 0, 0));
//		lblNewLabel13.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
//		lblNewLabel13.setBounds(30, 390, 605, 269);
//		this.add(lblNewLabel13);
//		this.setBounds(104, 104, 988, 658);
		//
		//
//		JLabel lblNewLabel14 = new JLabel("419&sa=X&ved=0ahUKEwjE2PiQu6DLAhUJfZAKHVWsDIk4PBDoAQhW");
//		lblNewLabel14.setForeground(new Color(0, 0, 0));
//		lblNewLabel14.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
//		lblNewLabel14.setBounds(30, 410, 605, 269);
//		this.add(lblNewLabel14);
//		this.setBounds(104, 104, 988, 658);
		//
		//
//		JLabel lblNewLabel15 = new JLabel("page&q=pasar%20un%20numero%20binario%20a%20decimal&f=false");
//		lblNewLabel15.setForeground(new Color(0, 0, 0));
//		lblNewLabel15.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
//		lblNewLabel15.setBounds(30, 430, 605, 269);
//		this.add(lblNewLabel15);
//		this.setBounds(104, 104, 988, 658);
		//
	
	}

}
