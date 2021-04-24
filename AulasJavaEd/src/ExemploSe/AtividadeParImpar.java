package ExemploSe;

import java.util.Scanner;

public class AtividadeParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valorDigitado = 0;
		
		System.out.println("Digite um valor: ");
		valorDigitado = Double.parseDouble(ler.nextLine()); //parsedouble: transforma string em double 
		
		valorDigitado = Math.round(valorDigitado);
		
		if (valorDigitado % 2 == 0)
		{	
			System.out.println("O numero " + valorDigitado + " é par.");
			System.out.println("A raiz quadrada do numero par é: " + Math.sqrt(valorDigitado));
			
		}
		else
		{
			System.out.println("O numero " + valorDigitado + " é impar.");
			System.out.println("O numero impar elevado ao quadrado é: " + Math.pow(valorDigitado, 2));
		}
	}

}
