package com.ecodeup.lambda;

public class Ejecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICalculadora calculadora = ()->System.out.println("bienvenido a las expresiones lambda");
		
		calculadora.mensaje();
		
	}

}
