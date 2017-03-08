package Modelo;

public class EstadoTerminado extends EstadoJuego{

	@Override
	protected void acertar(SistemaJuego sistemaJuego, int valorSimbolo) {
		sistemaJuego.getSistemaVista().haTerminado();
		
	}

	@Override
	protected void responderPregunta(SistemaJuego sistemaJuego, String respuesta) {
		sistemaJuego.getSistemaVista().haTerminado();
		
	}

}
