package com.capacitacion.excepciones;

import com.capacitacion.excepciones.personalizadas.ExcepPersonalizadas;
import com.capacitacion.excepciones.procesos.ProcesarDatos;

public class ExcepcionesApplication {

	public static void main(String[] args) {
		
		caso1();
		caso2();
		caso3();
		caso4();
		caso5();		
	}
	
	
	public static void caso1() {
		
		// cree una instancia de la clase ProcesarDatos y use el metodo division.
		//envie   los valores ("48", "0") - division por cero
		//en el metodo division capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola  desde  el catch StackTrace,Cause,Message; 
		// haga lo mismo para los valores ("15.8", "30")
		ProcesarDatos wProcesaDato = new ProcesarDatos();
		wProcesaDato.division("48", "0");
		wProcesaDato.division("15.8", "30");
		
	}
	public static void caso2() {
		
		//cree una instancia de la clase ProcesarDatos y use el metodo division. y use metodo arreglo
		//envie al metodo arry de string  de 3 valores para que se genere una excepcion.
		//capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola   StackTrace,Cause,Message del error; 
		ProcesarDatos wProcesa = new ProcesarDatos();
		String wArray[] = {"A","6","9"};
		wProcesa.arreglo(wArray);
	}
	
	public static void caso3() {
		
		//// cree una instancia de la clase ProcesarDatos y use el metodo fecha.
		//envie al metodo una fecha con el formato "yyyy/mm/dd".
		//capture e identifique la excepcion que se genera (no la excepcion general de java Exception) 
	    // Re-lance la excepcion y capturela aqui en el metodo case3 e imprima en consola StackTrace,Cause,Message del error; 
		ProcesarDatos wProcesaDatos3 = new ProcesarDatos();
		wProcesaDatos3.fecha("2021/08/12");
		
	}

	public static void caso4() {
		//manejo de excepciones personalizadas
		ProcesarDatos wProcesaDatos = new ProcesarDatos();
		
		try {
			String ruta = "src/main/java/com/capacitacion/excepciones/datos/data.txt";
			wProcesaDatos.leerArchivo(ruta);
		} catch (ExcepPersonalizadas e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println(e.getMessage()); 
		}
		
	}
	
	public static void caso5()  {
		//manejo de cierre de  objetos en lectura y escritura de arhivos
		ProcesarDatos wProcesaDatos = new ProcesarDatos();
		
		try {
			String rutaOrg = "src/main/java/com/capacitacion/excepciones/datos/data.txt";
			String rutaDes = "src/main/java/com/capacitacion/excepciones/datos/data2.txt";
			wProcesaDatos.leeryEscribirArchivo(rutaOrg, rutaDes);
		} catch (ExcepPersonalizadas e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e);
		}
	}
	

}
