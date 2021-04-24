package ExemploSe;

import java.util.*;

public class ParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valorDigitado;
		System.out.println("Digite um valor inteiro positivo: ");
		valorDigitado = ler.nextInt();
		
		if (valorDigitado % 2 == 0) {
			System.out.println("O numero " + valorDigitado + " é par!!");
		} else {
			System.out.printf("\nO numero %d é impar", valorDigitado);
		}
		
			/*
			 * %d numero inteiro - tipo int 
			 * %s - tipo string - cadeia de caracteres
			 * %f - tipo real - tipo double -- %.0f fazendo com duas casas
			 * 
			 *  print e println só concatena texto 
			 *  printf print formatado ex no else*/
	}

}
