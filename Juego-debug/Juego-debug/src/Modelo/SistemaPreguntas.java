package Modelo;
import java.util.ArrayList;
import java.util.Random;


public class SistemaPreguntas {
private ArrayList <PreguntaRespuestas> preguntasRespuestas;
private PreguntaRespuestas preguntaActual;

public SistemaPreguntas(){

this.setPreguntasRespuestas(new ArrayList <PreguntaRespuestas>());
this.inicializaPreguntas();


}


public void inicializaPreguntas(){

PreguntaRespuestas uno = new PreguntaRespuestas("El sistema de numeración más ampliamente usado es:" ,"Octal");
uno.agregarRespuestaInvalida("Binario");
uno.agregarRespuestaInvalida("Decimal");
uno.agregarRespuestaInvalida("Hexadecimal");
this.getPreguntasRespuestas().add(uno);
PreguntaRespuestas dos = new PreguntaRespuestas("¿1011 en base 2 es:?","1110 en base 10");
dos.agregarRespuestaInvalida("20 en base 10");
dos.agregarRespuestaInvalida("13 en base 10");
dos.agregarRespuestaInvalida("16 en base 10");
this.getPreguntasRespuestas().add(dos);
PreguntaRespuestas tres = new PreguntaRespuestas("¿32 en base 10?","100000 en base 2");
tres.agregarRespuestaInvalida("100001 en base 2");
tres.agregarRespuestaInvalida("10000 en base 2");
tres.agregarRespuestaInvalida("1001 en base 2");
tres.agregarRespuestaInvalida("1004 en base 2");
this.getPreguntasRespuestas().add(tres);
PreguntaRespuestas cuatro = new PreguntaRespuestas("El número 17 en base 10","es 10001 en base 2");
cuatro.agregarRespuestaInvalida("es 11110 en base 2");
cuatro.agregarRespuestaInvalida("es 11111 en base 2");
cuatro.agregarRespuestaInvalida("es 11000 en base 2");
this.getPreguntasRespuestas().add(cuatro);
PreguntaRespuestas cinco = new PreguntaRespuestas("Es un número binario:" , "10011 en base 2");
cinco.agregarRespuestaInvalida("120000 en base 2");
cinco.agregarRespuestaInvalida("10300 en base 2");
cinco.agregarRespuestaInvalida("10320 en base 2");
this.getPreguntasRespuestas().add(cinco);
PreguntaRespuestas seis = new PreguntaRespuestas("1100 en base 2 es:","12 en base 10");
seis.agregarRespuestaInvalida("26 en base 10");
seis.agregarRespuestaInvalida("24 en base 10");
seis.agregarRespuestaInvalida("23 en base 10");
this.getPreguntasRespuestas().add(seis);
PreguntaRespuestas siete = new PreguntaRespuestas("El número binario 101100 en base 2 es:","par");
siete.agregarRespuestaInvalida("impar");
siete.agregarRespuestaInvalida("< que 5 en base 10");
siete.agregarRespuestaInvalida("> que 9 en base 10");
this.getPreguntasRespuestas().add(siete);
PreguntaRespuestas ocho = new PreguntaRespuestas("El número 10011 en base 2 es","impar");
ocho.agregarRespuestaInvalida("par");
ocho.agregarRespuestaInvalida("< que 5 en base 10");
ocho.agregarRespuestaInvalida("> que 9 en base 10");
this.getPreguntasRespuestas().add(ocho);
PreguntaRespuestas nueve = new PreguntaRespuestas("El número 0111 en base 2 es:","< que 16 en base 10");
nueve.agregarRespuestaInvalida("> que 9 en base 10");
nueve.agregarRespuestaInvalida("< que 5 en base 10");
nueve.agregarRespuestaInvalida("par");
this.getPreguntasRespuestas().add(nueve);
PreguntaRespuestas diez = new PreguntaRespuestas("El número 15 en base 10 es:","1111 en base 2");
diez.agregarRespuestaInvalida("1110 en base 2");
diez.agregarRespuestaInvalida("1011 en base 2");
diez.agregarRespuestaInvalida("1101 en base 2");
this.getPreguntasRespuestas().add(diez);
this.setPreguntaActual(this.preguntaRapida());

}

//delegacion
protected boolean esRespuestaValida(String respuestaUsuario) {

return this.getPreguntaActual().esRespuestaValida(respuestaUsuario);
}

private void setPreguntasRespuestas(ArrayList<PreguntaRespuestas> preguntasRespuestas) {
this.preguntasRespuestas= preguntasRespuestas;

}

protected PreguntaRespuestas getPreguntaActual() {
return this.preguntaActual;
}

private void setPreguntaActual(PreguntaRespuestas preguntaActual) {
this.preguntaActual = preguntaActual;
}
private ArrayList<PreguntaRespuestas> getPreguntasRespuestas() {
return this.preguntasRespuestas;
}

//DELEGACION CON RESPUESTA MEZCLADA.

public ArrayList<String> respuestasMescladas() {

return this.getPreguntaActual().respuestasMescladas();

}

public String obtenerPregunta () {
   this.setPreguntaActual(preguntaRapida());
   return this.getPreguntaActual().getPregunta();
	
}


private PreguntaRespuestas preguntaRapida(){
Random aleatorio = new Random();
int indice;
PreguntaRespuestas unaPreguntaRespuestas = new PreguntaRespuestas(null, null) ;

if (this.getPreguntasRespuestas().size() == 0) {
this.inicializaPreguntas();
}
indice=aleatorio.nextInt((this.getPreguntasRespuestas().size()));
unaPreguntaRespuestas = this.getPreguntasRespuestas().get(indice);
return unaPreguntaRespuestas;

}
}