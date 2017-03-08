package Modelo;

public abstract class EstadoJuego {
protected abstract void acertar(SistemaJuego sistemaJuego, int valorSimbolo);
protected abstract void responderPregunta(SistemaJuego sistemaJuego, String respuesta); 
}
