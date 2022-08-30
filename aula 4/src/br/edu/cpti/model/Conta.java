package br.edu.cpti.model;

public interface Conta {
	public void deposito (double valor);
	public boolean saque (double valor);
	double taxaSaque = 1.50;

}
