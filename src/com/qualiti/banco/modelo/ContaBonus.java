package com.qualiti.banco.modelo;

public class ContaBonus extends Conta {

	private double bonus;

	@Override // redefini��o de metodo da classe pai
	public void creditar(double valor) {

		bonus = bonus + valor * 0.1;
		super.creditar(valor);

	}
	
	public void rederBonus() {
		super.creditar(bonus);
		bonus = 0;
		
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}