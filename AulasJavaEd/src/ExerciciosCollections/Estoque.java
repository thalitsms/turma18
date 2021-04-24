package ExerciciosCollections;

import java.lang.reflect.Constructor;

public class Estoque {
	private String nomeProduto;
	private int quantidade;
	
	public Estoque(String nomeProduto, int quantidade)
	{

		this.nomeProduto = nomeProduto ;
		this.quantidade = quantidade; 
	}


	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
