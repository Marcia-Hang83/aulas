package br.edu.cpti.model;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected double valorCobrado;
	protected  LocalDate dataConserto;
	protected Proprietario proprietario;

	public double getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public LocalDate getDataConserto() {
		return dataConserto;
	}

	public void setDataConserto(LocalDate dataConserto) {
		this.dataConserto = dataConserto;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Veiculo(double valorCobrado, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.valorCobrado = valorCobrado;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

}
