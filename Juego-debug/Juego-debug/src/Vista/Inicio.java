package Vista;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import Controlador.ControladorDelJuego;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Inicio extends JFrame{

	private SistemaVista svista;
	private Introduccion introduccion1;
	private Informacion info;
	private Ayuda ayuda ;
	private Autor autor;
	private ControladorDelJuego controlador;
	private JTabbedPane JTPJuego;
	public static JMenuItem nuevoJuego;
	
	public Inicio(ControladorDelJuego controlador) {
	    this.setControlador(controlador);
	    initialize();
	    this.setTitle("JuegoDSSB = Juego de simbolos,Sistema binario.");
		
	}


	void iniciarJuego () {
    this.getControlador().getSistemaJuego().iniciarJuego();
	ControladorDelJuego.jugar();	
	this.dispose();
	}
	
	private void initialize() {
		this.setBounds(100, 100, 1323, 742);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		this.setJTPJuego(new JTabbedPane(JTabbedPane.BOTTOM));
		this.getJTPJuego().setBounds(0, 25, 969, 679);
		this.getContentPane().add(this.getJTPJuego());
		this.setIntroduccion1(new Introduccion(this));
		this.getJTPJuego().addTab("Introduccion", null, this.getIntroduccion1(), null);
	
        
		
		this.setSvista(new SistemaVista(this.getControlador()));
		this.getJTPJuego().addTab("Juego",null, this.getSvista() ,null);
		this.getJTPJuego().setEnabledAt(1,false);
		this.setInfo(new Informacion());
		this.getJTPJuego().addTab("Enlaces",null, this.getinfo() ,null);
		this.setAyuda(new Ayuda(this));
		getContentPane().add(this.getAyuda());
	
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 969, 28);
		getContentPane().add(menuBar);
		
		
		this.setAutor(new Autor());
		this.getJTPJuego().addTab("Autores",null, this.getAutor() ,null);
		this.setAyuda(new Ayuda(this));
		getContentPane().add(this.getAyuda());
	
		
		JMenu juego = new JMenu("Juego");
		juego.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(juego);
		
		Inicio.nuevoJuego= new JMenuItem("Nuevo Juego");
		Inicio.nuevoJuego.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		juego.add(nuevoJuego);
		Inicio.nuevoJuego.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				iniciarJuego();
				
			}
		});
		
		JMenuItem salir = new JMenuItem("Salir");
		salir.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		juego.add(salir);
	    
	}

	
	public Informacion getinfo(){
		return info;
	}
	
	private void setInfo(Informacion info){
		this.info=info;
	}
	public SistemaVista getSvista() {
		return svista;
	}

	public void setSvista(SistemaVista svista) {
		this.svista = svista;
	}

	private Introduccion getIntroduccion1() {
		return introduccion1;
	}

	private void setIntroduccion1(Introduccion introduccion1) {
		this.introduccion1 = introduccion1;
	}

	public ControladorDelJuego getControlador() {
		return controlador;
	}

	public void setControlador(ControladorDelJuego controlador) {
		this.controlador = controlador;
	}
	public Ayuda getAyuda() {
		return ayuda;
	}


	private void setAyuda(Ayuda ayuda) {
		this.ayuda = ayuda;
	}


	protected JTabbedPane getJTPJuego() {
		return JTPJuego;
	}


	protected void setJTPJuego(JTabbedPane jTPJuego) {
		JTPJuego = jTPJuego;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}