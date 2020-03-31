package com.barbaro.pd.creacional;

public class BebidaFactory {

	public static Bebida getBebidaByNombre(String nombre) {
		switch(nombre.toLowerCase()) {
			case "refresco":
				return new Refresco(nombre, "Fanta");
			case "jugo":
				return new Jugo(nombre, "Durazno", "Normal");
			default:
				return null;
		}
	}
	
	public static Bebida getBebidaByTipoComida(String tipoComida) {
		if(tipoComida.equalsIgnoreCase("desayuno")) {
			return new Jugo();
		}else if(tipoComida.equalsIgnoreCase("comida")) {
			return new Refresco();
		}
		return null;
	}
}
