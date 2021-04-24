package LacosForWhile;

import java.util.*;

public class Repeticao3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade;
		
		
		do
		{
			System.out.printf("Entre com a sua idade: \n");
			idade = ler.nextInt();
			
			System.out.printf("Sua idade: %d", idade );
			
			if(idade >= 18)
			{
				System.out.printf("\nVoce é de maior!\n");
			}
			else {
				System.out.printf("\nVoce é de menor!\n");
			}
			
			
		}while(idade >= 1);

	}

}
