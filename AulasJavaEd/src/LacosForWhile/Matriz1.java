package LacosForWhile;

import java.util.*;


public class Matriz1 {

	public static void main(String[] args) {
int [][] matriz = new int [3][3];
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Matriz M [3][3]\n");
		
		for (int linha = 0; linha <3; linha++)
		{	for (int coluna = 0; coluna <3; coluna++) 
			{
				System.out.printf("Insira o elemento M [%d][%d]: ", linha + 1, coluna + 1);
				matriz[linha][coluna] = ler.nextInt();
			}
			
		}
		
		System.out.println("\nA Matriz ficou: \n");
		for (int linha = 0; linha <3; linha++)
		{	for (int coluna = 0; coluna <3; coluna++) 
			{
				System.out.printf("\t %d \t", matriz [linha][coluna]); // o \t ? o tab pra deixar organizado
				
			}
			System.out.println();
		}

	}

}
