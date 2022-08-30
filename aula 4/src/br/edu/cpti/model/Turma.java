package br.edu.cpti.model;

import br.edu.cpti.Curso;

public class Turma {
	private String nomeCurso;
	private Curso curso;

	public Turma(String nomeCurso, Curso curso) {
		super();
		this.nomeCurso = nomeCurso;
		this.curso = curso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
