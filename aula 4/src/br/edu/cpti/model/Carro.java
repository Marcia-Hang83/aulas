package br.edu.cpti.model;

import java.time.LocalDate;

import br.edu.cpti.TipoServico;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(double valorCobrado, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}

	

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public double lavarCarro() {
		valorCobrado= valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public double trocarOleo() {
		if (dataConserto.getDayOfWeek().getValue()==6) {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico()-50;
		}else
			valorCobrado =valorCobrado + TipoServico.OLEO.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public double revisao() {
	if(dataConserto.getDayOfMonth()==10){
		
		valorCobrado= valorCobrado + TipoServico.REVISAO.getValorPorServico()*0.90;
	}else {
		valorCobrado= valorCobrado + TipoServico.REVISAO.getValorPorServico();
	}
		return valorCobrado;
	}
	

}
