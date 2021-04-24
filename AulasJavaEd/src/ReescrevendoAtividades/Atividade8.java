package ReescrevendoAtividades;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double consumidor, fabrica, custoFinal;
		
		System.out.println("Digite o custo de fabrica: ");
		fabrica = ler.nextInt();
		
		custoFinal = (fabrica * 0.28) + (fabrica * 0.45);
		consumidor = fabrica + custoFinal;
				
		
		System.out.println( "O valor final ao consumidor é de: " + consumidor + " reais." );


	}

}
