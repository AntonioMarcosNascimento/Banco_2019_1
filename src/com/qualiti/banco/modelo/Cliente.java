package com.qualiti.banco.modelo;

import java.util.Arrays;

public class Cliente extends Pessoa implements Comparable<Cliente> {

	public Cliente() {
		super();

	}

	public Cliente(String nome, String cpf) {
		super(nome, cpf);

	}

	@Override
	
	/**
	 * retorna 0 qdo forem objetos com ordem igual
	 * retorna -1 qdo this for menor que o parametro
	 * retorna 1 qdo this for maior que o parametro
	 * 
	 */
	
	public int compareTo(Cliente o) {
		return this.getNome().compareTo(o.getNome());
		

	}
	
	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[2];
		
		Cliente cli1 = new Cliente();
		cli1.setNome("Ze Maria");
		
		Cliente cli2 = new Cliente();
		cli2.setNome("Ana");
		
		clientes[0] = cli1;
		clientes[1] = cli2;
		
		Arrays.sort(clientes);
		
		for(Cliente cli : clientes) {
			
			System.out.println(cli.getNome());
		}
		
		
	}

}
