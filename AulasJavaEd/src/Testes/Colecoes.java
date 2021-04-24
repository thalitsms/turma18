package Testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		
		// JAVA COLLECTIONS
		Collection < String > nomes = new ArrayList(); 
		nomes.add("Thalita");
		nomes.add("Mayra");
		nomes.add("Santos");
		nomes.add("Rosa");
		
		//percorre elementos
		for (String name : nomes) 
		{
			System.out.println("Lista: " + name );
		}
		/* //add nova lista na existente
		Collection < String > nomes2 = Arrays.asList("Joana", "Marcos");
		nomes.addAll(nomes2);
		System.out.println("Lista: " + nomes);*/
		
		
		
		/*System.out.println("Contém o nome Thalita? " + nomes.contains("Thalita")); //verifiar um dado especifico
		System.out.println("Lista: " + nomes);*/

		
		/*System.out.println("Lista de nomes: " + nomes);//limpar campos da lista
		nomes.clear();
		System.out.println("Lista de nomes: " + nomes);*/

	
		/*System.out.println("Lista de nomes: " + nomes);
		nomes.remove("Mayra"); // deletar o nome da lista
		System.out.println("Lista de nomes: " + nomes);*/
		
		/*if(nomes.isEmpty()) //verificar se tem algum nome vazio na lista
		{
			System.out.println("Lista vazia: ");
		}
			else 
			{
				System.out.println("Lista de nomes: " + nomes);
			}*/
		
		
	}

}
