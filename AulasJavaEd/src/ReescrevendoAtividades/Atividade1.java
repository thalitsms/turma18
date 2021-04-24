package ReescrevendoAtividades;

import java.util.*;

public class Atividade1 
{
	public static void main (String[] args)
	{
		
		Scanner ler = new Scanner(System.in);
		int idade, diasFinal;
		System.out.println("Digite sua idade em anos: ");
		idade = ler.nextInt();
		
		diasFinal = idade * 365;
		System.out.println("Sua idade em dias é de: " + diasFinal);
	}
	
}

