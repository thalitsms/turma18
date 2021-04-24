package ReescrevendoAtividades;

import java.util.*;

public class Atividade6 {

	public static void main (String [] args)
	{
		Scanner ler = new Scanner(System.in);
		double d, x1, x2, y1, y2, p1, p2;
		
		System.out.println("Digite o valor de x1: ");
		x1 = ler.nextInt();
		System.out.println("Digite o valor de x2: ");
		x2 = ler.nextInt();
		System.out.println("Digite o valor de y1: ");
		y1 = ler.nextInt();
		System.out.println("Digite o valor de y2: ");
		y2 = ler.nextInt();
		
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		d = Math.sqrt((p1 + p2));
		
		
		
		System.out.println( "A distancia é: " + d);
	}
}
