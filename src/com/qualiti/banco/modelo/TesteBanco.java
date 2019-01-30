package com.qualiti.banco.modelo;

public class TesteBanco {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.setNumero("1234-x");
		c1.setSaldo(500);
		c1.creditar(1000);
		
		System.out.println(c1.getSaldo());
		
		
	}

}
