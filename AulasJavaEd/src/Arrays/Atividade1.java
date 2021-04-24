package Arrays;

import java.util.*;


public class Atividade1 {

	public static void main(String[] args) {
		/*int valores[] = {10, 11, 20, 5, 1000};
		
		String times[] = {"SPFC", "PALMEIRAS", "SANTOS", "CORINTHIANS"};
		
		for (int x = 0; x<times.length; x++) {
		System.out.println("O time é: " + times[x]);
		}*/
		
		Scanner ler = new Scanner(System.in);
		int valores[] = new int [5];
		
		for (int y = 0; y < valores.length; y++) //length caso nao saiba o valor/tamanho
		{
			System.out.printf("Digite o valor %d: ", (y + 1));
			valores[y] = ler.nextInt();
		}
		
		for (int y = 0; y < valores.length; y++) {
			System.out.printf("\n0" + "O valor " + (y + 1) + " é: " + valores[y]);
		}
	}

}
