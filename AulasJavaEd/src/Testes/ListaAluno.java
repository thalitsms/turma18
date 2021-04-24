package Testes;

import java.util.HashSet;
import java.util.Set;

import Classes.Aluno;

public class ListaAluno {

	public static void main(String[] args) 
	{
		//java collections
		Set < Aluno > conjunto = new HashSet < Aluno > ();
		Aluno a = new Aluno ("Thalita Mayra dos Santos", "Ads", 8.5);
		Aluno b = new Aluno ("Larissa dos Santos", "java", 6.5);
		Aluno c = new Aluno ("Juliana dos Santos", "so", 5);
		Aluno d = new Aluno ("Lorena dos Santos", "ti", 7.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println("Alunos: " + conjunto);
	}

}
