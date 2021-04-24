package ExemploSe;

import java.util.*;


public class AtividadeNumeroMaior {

	public static void main(String[] args) {
		
		int numeroMaior = 0;
		int primeiroNumero;
		int segundoNumero;
		int terceiroNumero;		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		primeiroNumero = ler.nextInt();
		if (primeiroNumero > numeroMaior) {
			numeroMaior = primeiroNumero;
		}
		
		System.out.println("Digite o segundo numero: ");
		segundoNumero = ler.nextInt();
		if (segundoNumero > numeroMaior) {
			numeroMaior = segundoNumero;
		}
		
		System.out.println("Digite o terceiro numero: ");
		terceiroNumero = ler.nextInt();
		if (terceiroNumero > numeroMaior) {
			numeroMaior = terceiroNumero;
		}
		
		if (primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
			System.out.println("Os numeros digitados sao iguais, faça novamente!");
		} else {
			System.out.println("O maior numero é: " + numeroMaior);
		}
	}

}
