package com.barbaro.pd.creacional;

public class Jugo extends Bebida{

	private String fruta;
	private String tipo;
	
	public Jugo() {
		super("jugo chido");
	}
	
	public Jugo(String nombre, String fruta, String tipo) {
		super(nombre);
		this.fruta = fruta;
		this.tipo = tipo;
	}
	
	public String getFruta() {
		return fruta;
	}
	
	public void setFruta(String fruta) {
		this.fruta = fruta;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String Consultar() {
		return "Para estar super fit";
	}
}
