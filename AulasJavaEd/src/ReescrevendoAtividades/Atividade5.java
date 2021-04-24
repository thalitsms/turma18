package ReescrevendoAtividades;

import java.util.*;

public class Atividade5 {

	public static void main (String [] args)
	{
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, media, mediaFinal;
		
		System.out.println("Digite sua nota 1: ");
		nota1 = ler.nextInt();
		System.out.println("Digite sua nota 2: ");
		nota2 = ler.nextInt();
		System.out.println("Digite sua nota 3: ");
		nota3 = ler.nextInt();
		
		
		media = (nota1 / 2) + (nota2 / 3) + (nota3 / 5);
		
		
		System.out.println( "Sua media é: " + media);
	}
}
