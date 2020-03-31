package com.barbaro.pd.creacional;

public class Refresco extends Bebida{
	
	private String sabor;
	
	public Refresco() {
		super("refresco");
	}
	
	public Refresco(String nombre, String sabor) {
		super(nombre);
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	@Override
	public String Consultar() {
		return "Un refresco para la fiesta";
	}
	
}
