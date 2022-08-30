package br.edu.cpti;

public enum Curso {

	INTEGRAL("terça e quinta",40,1000),
	MANHA("quarta e sexta",80,2000),
	NOITE("sábado",100,3500);
	
	private final String diasDaSemana;
	private final int cargaHoraria;
	private final double valor;
	
	
	private Curso(String diasDaSemana, int cargaHoraria, double valor) {
		this.diasDaSemana = diasDaSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}


	public String getDiasDaSemana() {
		return diasDaSemana;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public double getValor() {
		return valor;
	}
	
}
