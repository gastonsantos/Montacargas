package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	
	@Test
	public void testQueAgregaCarga(){
		Montacarga montacarga1 = new Montacarga(200.0);
		Carga carga1 = new Carga(150.0);
		assertTrue(montacarga1.carga(carga1));
	}
	
	
	@Test
	public void testQueObtieneLaCantidadDePesoEnMontacarga() {
		
		Montacarga montacarga1 = new Montacarga(200.0);
		Carga carga1 = new Carga(150.0);
		Carga carga2 = new Carga (20.0);
		montacarga1.carga(carga1);
		montacarga1.carga(carga2);
		Double valorEsperado = 170.0;
		Double valorObtenido = montacarga1.obtenerCarga();
		assertEquals(valorEsperado, valorObtenido);
		
		
	}
	@Test
	public void testQueLimpiaMontacargaDeTodasLasCargas(){
		Montacarga montacarga1 = new Montacarga(200.0);
		Carga carga1 = new Carga(150.0);
		Carga carga2 = new Carga (20.0);
		montacarga1.carga(carga2);
		montacarga1.carga(carga1);
		montacarga1.descargarMontacarga();
		Integer valorEsperado = 0;
		Integer valorObtenido = montacarga1.cantidadDeCargasEnMontacarga();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void testQueCuentaCantidadDeCargasHechas(){
		
		Montacarga montacarga1 = new Montacarga(200.0);
		Carga carga1 = new Carga(150.0);
		Carga carga2 = new Carga (20.0);
		montacarga1.carga(carga2);
		montacarga1.carga(carga1);
		Integer valorEsperado = 2;
		Integer valorObtenido = montacarga1.cantidadDeCargasEnMontacarga();
		assertEquals(valorEsperado, valorObtenido);
		
	}
	@Test
	public void testQueMuestraPromedio(){
		Montacarga montacarga1 = new Montacarga(200.0);
		Carga carga1 = new Carga(150.0);
		Carga carga2 = new Carga (50.0);
		montacarga1.carga(carga2);
		montacarga1.carga(carga1);
		montacarga1.obtenerCarga();
		Double valorEsperado= 100.0;
		Double valorObtenido = montacarga1.obtenerCargaPromedio();
		assertEquals(valorEsperado, valorObtenido,0.1);
		
	}
	

}
