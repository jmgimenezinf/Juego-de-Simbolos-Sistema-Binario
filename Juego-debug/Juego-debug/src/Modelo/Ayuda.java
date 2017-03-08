package Modelo;
import java.util.ArrayList;
public class Ayuda {
	
	private ArrayList <String> ayudaGral;
	private ArrayList <String> ayudaIntercambios; 
	private ArrayList <String> ayudaAciertos;
	private String ayudaContextual;
	private ArrayList <String> ayudaSeleccion;

	public Ayuda () {
		this.inicializarAyuda();
	}

	/*
	 * Descripcion de los tipos de ayuda
	 */
	private void inicializarAyuda() {

		   this.setAyudaAciertos(new ArrayList<String>());
		   this.setAyudaGral(new ArrayList<String>());
		   this.setAyudaIntercambios(new ArrayList<String>());
		   this.setAyudaSeleccion(new ArrayList<String>());
		   this.getAyudaAciertos().add("Cuando desee cargar\n" +
				    "un valor de un s�mbolo,\n" +
				    "debe seleccionar haciendo click\n" +
				    "con el mouse ,sobre el mismo,\n" +
				    "el s�mbolo quedar� con fondo verde.\n" +
				    "Podr� cargar el valor\n" +
				    "en una misma ventana\n" +
				    "como vemos en la figura C.\n"+
				    "Ante dudas ,respecto\n"+
				    "de c�mo sleccionae un\n"+
				    "simbolo ,acceda al boton\n"+
				    "*Ayuda Selecci�n*\n"+
				    "\n" 
				   
				   );
			   this.getAyudaAciertos().add("/Imagenes/AyuProbarSuerte.jpg");
			   this.getAyudaGral().add("Cada s�mbolo del tablero tiene \n" +
			   		"un valor(que es cero,o uno).\n"+
			   		"En cada fila y en\n" +
			   		"cada columna de la tabla\n" +
			   		"de simbolos ,hay un n�mero \n" +
			   		"binario.Por ejemplo, en \n" +
			        "el tablero de la imagen.\n" +
			        "En la primera fila, 4\n" +
			   		"representa el valor decimal,\n" +
			   	    "del n�mero binario (de esa\n" +
			   		"fila.).Entonces" + 
			   	    "el calculo que\n"+
			   		"se necesita\n" +
			   		"hacer ,es el de la figura B.\n" +
			   		"Si ha descubierto alg�n valor de\n" +
			   	    "un simbolo ,haciendo click en el\n" +
			   		"bot�n *Ayuda Aciertos* \n" +
			   		"ver� como cargar este valor.  \n" +
			   		"Sino,puede intercambiar dos\n" +
			   		"simbolos ,siempre y cuando\n" +
			   		"no queden mas de 3 simbolos\n" +
			   		"iguales \n" +
			   		"en cada fila y columna.Solo\n" +
			   		"podr� hacerlo si responde\n"+
			   		" correctamente\n" +
			   		"a una pregunta,haciendo click\n" +
			   		"en el bot�n *Ayuda Intercambios*\n" +
			   		"ver� como hacerlo.\n" +
                    "Finalizar� la partida actual\n"+
			   		"del juego,\n" +
			   		"cuando se logre descubrir el\n"+
			   		"valor de los 5\n" +
			   		"simbolos antes de que se terminan \n" +
			   		"las 2 vidas,o decide finalizar.  \n" +
			   		"Luego podr� reiniciar el juego.  \n" 
			   	); 
			   this.getAyudaGral().add("/Imagenes/AyuGeneral.jpg");
			   this.getAyudaIntercambios().add("Para intercambiar dos simbolos:\n" +
			   		"a)Primero hay que seleccionar \n" +
			   		"el primer simbolo. \n" +
			   		"Haciendo clicj en el bot�n\n" +
			   		"*Ayuda Selecci�n* sabr�s \n" +
			   		"como seleccionar.\n" +
			   		"b)Del mismo modo ,seleccionar\n" +
			   		"luego el segundo simbolo.\n" +
			   		"Recuerde no pueden quedar\n" +
			   		"mas de tres simbolos\n" +
			   		"iguales ,ni en una fila,\n" +
			   		"ni en una columna.\n" +
			   		"Si el intercambio es\n" +
			   		"posible aparecer� una ventana\n" +
			   		"con una pregunta ,deber�\n" +
			   		"seleccionar la opci�n\n" +
			   		"correcta ,para que se \n" +
			   		"efectivice el intercambio,\n" +
			   		"en cuyo caso,se actualizar�n\n" +
			   		"las conversiones a decimal\n" +
			   		"de las filas y \n" +
			   		"columnas afectadas.\n" 
			   		);
			   this.getAyudaIntercambios().add("/Imagenes/AyuIntercamb.jpg");
			   this.getAyudaSeleccion().add("Seleccionaras un s�mbolo \n" +
			   		"haciendo un click con el \n" +
			   		"mouse sobre el mismo, \n" +
			   		"el s�mbolo quedara con fondo,\n" +
			   		"verde,como vemos en la figura D.\n" + 
			   		"Para deseleccionarlo has \n" +
			   		"otro click sobre el mismo.\n");
			   this.getAyudaSeleccion().add("/Imagenes/AyuSeleccion.jpg");
		
			}


	protected ArrayList<String> getAyudaGral() {
		return ayudaGral;
	}

	private void setAyudaGral(ArrayList<String> ayudaGral) {
		this.ayudaGral = ayudaGral;
	}

	protected ArrayList<String> getAyudaIntercambios() {
		return ayudaIntercambios;
	}

	private void setAyudaIntercambios(ArrayList<String> ayudaIntercambios) {
		this.ayudaIntercambios = ayudaIntercambios;
	}

	protected ArrayList<String> getAyudaAciertos() {
		return ayudaAciertos;
	}

	private void setAyudaAciertos(ArrayList<String> ayudaAciertos) {
		this.ayudaAciertos = ayudaAciertos;
	}

	protected String getAyudaContextual() {
		return ayudaContextual;
	}

	protected void setAyudaContextual(String ayudaContextual) {
		this.ayudaContextual = ayudaContextual;
	}

	public ArrayList<String> getAyudaSeleccion() {

		return ayudaSeleccion;
	}

	public void setAyudaSeleccion(ArrayList<String> ayudaSeleccion) {
	 this.ayudaSeleccion= ayudaSeleccion;
	}


	
	
	
}
