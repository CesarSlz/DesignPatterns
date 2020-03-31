package com.barbaro.pd.creacional;

public class PresidenteSingleton {

	private static PresidenteSingleton instance;
	
	private String nombre;
	private String pais;
	
	private PresidenteSingleton() {
	}
	
	public static PresidenteSingleton getInstance() {
		if(instance == null) {
			instance = new PresidenteSingleton();
		}
		return instance;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
	
}
