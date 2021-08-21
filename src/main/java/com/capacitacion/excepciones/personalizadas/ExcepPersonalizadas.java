package com.capacitacion.excepciones.personalizadas;

public class ExcepPersonalizadas extends Exception{
	String causa;
	String tipoFalla;
	
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public String getTipoFalla() {
		return tipoFalla;
	}
	public void setTipoFalla(String tipoFalla) {
		this.tipoFalla = tipoFalla;
	}

	
	public ExcepPersonalizadas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExcepPersonalizadas(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public ExcepPersonalizadas(String message, Throwable cause) {
		super(message, cause);
		Exception exception = new Exception();
		// TODO Auto-generated constructor stub
		exception.printStackTrace();
		System.err.println(exception);
	}
	public ExcepPersonalizadas(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public ExcepPersonalizadas(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
