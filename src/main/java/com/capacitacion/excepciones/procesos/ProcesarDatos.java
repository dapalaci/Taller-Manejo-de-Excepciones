package com.capacitacion.excepciones.procesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.capacitacion.excepciones.personalizadas.ExcepPersonalizadas;


public class ProcesarDatos {
	
	public int division(String numero1,String numero2) {
		int resultado = 0;
		try {
			resultado=Integer.valueOf(numero1)/Integer.valueOf(numero2);
		} catch (NumberFormatException | ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Division invalida...." + e.getMessage());
			
		}
		return resultado;		
	}
	
	
	public void arreglo(String[] lista) {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(lista[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Longitud del arreglo invalida..." + e.getMessage());
		}
	}
	
	public void fecha(String input) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date   date  = format.parse (input );
			date.toString();
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Formato de fecha invalido..." + e.getMessage());
		}
	}
	
	public void leerArchivo(String rutaArchivo) throws ExcepPersonalizadas {
		try {
			
			String []datos;
			Scanner data = new Scanner(new File(rutaArchivo));
			 
			while (data.hasNextLine()) {
				datos = data.nextLine().split(";");
				System.out.println("Los datos son: "+datos[0]);
				System.out.println("Los datos son: "+datos[1]);
				System.out.println("Los datos son: "+datos[2]);
			}
		} catch (ArrayIndexOutOfBoundsException | FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Archivo data no encontrado..." + e.getMessage());
			System.out.println("Archivo no encontrado..." + e.getCause());
			
			throw new ExcepPersonalizadas("Archivo data no encontrado...",e);
			
			
		}	
	}
	
	public void leeryEscribirArchivo(String rutaOrg, String rutaDes) throws ExcepPersonalizadas {
		String[] datos = null;
		try {
			Scanner data = new Scanner(new File(rutaOrg));
			FileWriter archivo = new FileWriter(rutaDes);
			
			while (data.hasNextLine()) {
				datos = data.nextLine().split(";");
				 
				String wNombre =datos[0];
				String wProfesion =datos[2];
				
				try {
					archivo.write(wNombre+";"+wProfesion+ "\r\n");
					System.out.println(wNombre);
					System.out.println(wProfesion);
					 
				}catch (IOException | ArrayIndexOutOfBoundsException e) {
					// TODO: handle exception
					e.printStackTrace();
					System.out.println("Archivo destino no encontrado..." + e.getMessage());
					throw new ExcepPersonalizadas("Archivo destino no encontrado..."+e);
				}	
			}data.close();
			archivo.close();
		} catch (IOException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Archivo origen invalido..." + e.getMessage());
			throw new ExcepPersonalizadas("Archivo origen invalido...",e);
		}	
	}

	

}
