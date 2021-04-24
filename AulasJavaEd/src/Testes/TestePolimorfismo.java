package Testes;

import Classes.PessoaFisica;
import Classes.PessoaJuridica;
import Classes.Pessoa1;

public class TestePolimorfismo {
	public static void main (String [] args)
	{
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("thalita");
		fisica.setCpf(44125388857L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("mayra");
		juridica.setCnpj(45632145213651L);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa1 pessoa: pessoas)
		{
			System.out.println(pessoa.getNome());
			
		}
	}
}
