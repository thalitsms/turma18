package Testes;

import Classes.Coordenador;
import Classes.Funcionario;
import Classes.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa thalita = new Pessoa("Thalita", 555);
		Funcionario mayra = new Funcionario("Mayra", 555, "TI");
		Pessoa maria = new Funcionario("Maria", 555, "TI");
		Pessoa jose = new Coordenador("Jose", 555, "TI");
		
		System.out.println("Matricula: " + thalita.getMatricula());
		System.out.println("Nome: " + mayra.getNome());
		System.out.println("Departamento: " + mayra.getDepartamento());
		System.out.println("Matricula: " + jose.getMatricula());
		
	}

}
