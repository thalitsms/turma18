package Arrays;

import java.util.*;


public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int lancamentos[] = new int[10];
		double mediaA = 0.00, somaValores = 0.00; 
		int maiorP = 0;
		int contadorMaiorP = 0;
		
		for (int x = 0; x < lancamentos.length; x++ )
		{
			System.out.printf("Digite o resultado do %d lançamento: ", (x+1));
			lancamentos[x] = ler.nextInt();
		}
		
		
		for (int x = 0; x < lancamentos.length; x++ )
		{
			System.out.printf("\nO valor do lançamento %d e %d\n", (x+1), lancamentos[x]);
			somaValores = somaValores + lancamentos[x];
			if (lancamentos[x] >= maiorP) {
				if (lancamentos[x] > maiorP) { //apenas o maior valor digitado
					contadorMaiorP = 0;
				}
				maiorP = lancamentos[x];
				contadorMaiorP++;
			}
		}
		//processamentos
		mediaA = somaValores / lancamentos.length;
		
		//saidas
		System.out.printf("Total dos lançamentos digitados: %.0f", somaValores);
		System.out.printf("\n A média é %.2f", mediaA);
		System.out.printf("\n O maior valor é %d", maiorP);
		System.out.printf("\n O maior valor aparece %d vezes", contadorMaiorP);
		
	}

}
