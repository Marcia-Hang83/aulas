package br.edu.cpti.teste;

import br.edu.cpti.Curso;
import br.edu.cpti.model.Turma;

public class TesteCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Turma turma1 = new Turma("JAVA WEB",Curso.INTEGRAL);
       System.out.println(turma1.getCurso());
       System.out.println(turma1.getCurso().getValor());
	}
	

}
