package ExerciciosCollections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;



public class ListaEstoque {

	public static void main(String[] args) {

		
//		Collection < Estoque > listaEstoque = new ArrayList<Estoque>();
//		Estoque e1 = new Estoque("Atum enlatado", 600);
//		Estoque e2 = new Estoque("Sabonete em pedra", 650);
//		Estoque e3 = new Estoque("Atum enlatado", 150);
//		Estoque e4 = new Estoque("Atum enlatado", 60);
//		listaEstoque.add(e1);
//		listaEstoque.add(e2);
//		listaEstoque.add(e3);
//		listaEstoque.add(e4);
		
		
		Collection < String > nomeProduto = new ArrayList(); 
		nomeProduto.add("Atum enlatado");
		nomeProduto.add("Sabonete em pedra");
		nomeProduto.add("Sabão em pó");
		nomeProduto.add("Conjunto de talheres");
		
		Collection < Integer > quantidade = new ArrayList(); 
		quantidade.add(600);
		quantidade.add(650);
		quantidade.add(150);
		quantidade.add(60);
		
		//verificar se tem algum nome vazio na lista
		System.out.println("LISTA PRODUTOS/ESTOQUE: ");
		
		System.out.println("Produto: " + nomeProduto + "\nQuantidade: " + quantidade); 
		
		
		
		// deletar o nome da lista
		System.out.println("LISTA ATUALIZADA APÓS REMOÇÃO: ");
		nomeProduto.remove("Conjunto de talheres");
		quantidade.remove(60);
		System.out.println("Lista de produtos: " + nomeProduto + "\nQuantidade: " + quantidade);
		
		//add nova lista na existente
		System.out.println("LISTA ATUALIZADA APÓS ADIÇÃO: ");
		Collection < String > nomeProduto1 = Arrays.asList("Maionese", "Amaciante");
		nomeProduto.addAll(nomeProduto1);
		Collection < Integer > novaQuantidade = Arrays.asList(50, 25);
		quantidade.addAll(novaQuantidade);
		System.out.println("Lista: " + novaQuantidade);
		
		//percorrer lista
		
		for (String name : nomeProduto) 
		{
			System.out.println("Produtos: " + name);
		}
		
		for (Integer name : quantidade) 
		{
			System.out.println("Quantidade: " + name );
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Set < Estoque > conjunto = new HashSet < Estoque > ();
		Estoque a = new Estoque("Alimentos", "Atum Enlatado", 650);
		Estoque b = new Estoque("\nProdutos de limpeza", "Amaciante", 160);
		Estoque c = new Estoque ("\nHigiene", "Sabonete em pedra", 500);
		Estoque d = new Estoque ("\nCasa", "Conjunto de Talheres", 600);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println("Estoque: " + conjunto);*/

	}

}
