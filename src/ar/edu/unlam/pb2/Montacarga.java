package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Montacarga {
	
private Double pesoMaximo;
private Double acumulado;

private ArrayList<Carga> lista = new  ArrayList<Carga>();

public Montacarga(Double pesoMaximo) {
	this.pesoMaximo = pesoMaximo;
	acumulado = 0.0;
}
public Double getPesoMaximo() {
	return pesoMaximo;
}
public void setPesoMaximo(Double pesoMaximo) {
	this.pesoMaximo = pesoMaximo;
}


//Agrego CARGA siempre y cuando no pase el peso maximo establecido
public Boolean carga(Carga carga1){
	
if(pesoMaximo >= carga1.getCarga()+acumulado){
	lista.add(carga1);
	
	return true;
	
}else{
	
	return false;
}
	
	
}
//obtengo el peso En montacarga ACTUAL
public Double obtenerCarga(){

	for(Carga e: lista){
		acumulado += e.getCarga();
	}
	return acumulado;
	
}
//VACIO MONTACARGA
public void descargarMontacarga(){
	
	lista.clear();
}
// SACO PROMEDIO DE peso MONTACARGA ACTUAL
public Double obtenerCargaPromedio(){
	Double promedio = 0.0;
	
	promedio = acumulado / lista.size();
	return promedio;
	
}

public Integer cantidadDeCargasEnMontacarga(){
	return lista.size();
	
}

}
