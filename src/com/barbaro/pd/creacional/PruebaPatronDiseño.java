package com.barbaro.pd.creacional;

import java.lang.reflect.Field;

public class PruebaPatronDiseño {

	public static void main(String[] args) {
		
		// Creacional - Singleton
		PresidenteSingleton presidente = PresidenteSingleton.getInstance();
		
		System.out.println(presidente);
		
		presidente.setNombre("Juan");
		presidente.setPais("México");
		
		presidente = PresidenteSingleton.getInstance();
		
		System.out.println(presidente);
		
		// Creacional - Factory
		Bebida refresco = BebidaFactory.getBebidaByNombre("refresco");
		System.out.println(refresco.Consultar());
		
		Bebida jugo = BebidaFactory.getBebidaByNombre("Jugo");
		System.out.println(jugo.Consultar());
		
		Bebida bebidaChida = BebidaFactory.getBebidaByTipoComida("desayuno");
		System.out.println(bebidaChida.Consultar());
		System.out.println(bebidaChida.getNombre());
		
		Class clase = bebidaChida.getClass();
		
		Field[] attrs = clase.getFields();
		for(Field at: attrs) {
			System.out.println(at.getName());
		}
		
	}
}
