package Modelo;

public class EstadoPorFinalizar extends EstadoJuego{

protected void acertar(SistemaJuego sistemaJuego, int valorSimbolo) {
		
		if	(sistemaJuego.getUltimoSeleccionado().getValor()==valorSimbolo){
	     
			 sistemaJuego.agregarSimboloAcertado(); 
			 sistemaJuego.getSistemaVista().haAcertado();
			 if (sistemaJuego.getSimbolosAcertados().size()==SistemaJuego.getMaxAciertos()){
			 sistemaJuego.getSistemaVista().haGanado();
			 sistemaJuego.setEstadoJuego(new EstadoTerminado());
			 }
			 
		}
			
			else
			{
				sistemaJuego.setVidaActual(sistemaJuego.getVidaActual()-1);
				sistemaJuego.getSistemaVista().noHaAcertado();
				sistemaJuego.getSistemaVista().haPerdido();
				sistemaJuego.setAyudaContextual("Puede iniciar una nueva partida haciendo click en juego , nuevo juego");
				sistemaJuego.setEstadoJuego(new EstadoTerminado());
			}	
		}
	
			protected void responderPregunta(SistemaJuego sistemaJuego, String respuesta) {
				if (sistemaJuego.getSistemaPreguntas().esRespuestaValida(respuesta)
						){
					sistemaJuego.getSistemaVista().respondioCorrectamente();

				}
				
				else{
					sistemaJuego.setVidaActual(sistemaJuego.getVidaActual()-1);
					sistemaJuego.getSistemaVista().respondioIncorrectamente();
					sistemaJuego.getSistemaVista().haPerdido();
					sistemaJuego.setAyudaContextual("Puede iniciar una nueva partida haciendo click en juego , nuevo juego");
					sistemaJuego.setEstadoJuego(new EstadoTerminado());
				}
				
				
				
			}



	
	
	
	
	
	
	
	
	
	
	
	
}
