package ReescrevendoAtividades;

import java.util.*;

public class Atividade4 {

	public static void main (String[] args)
	{
		
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, r, s;
		System.out.println("Digite o  valor de a: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de b: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de c: ");
		c = ler.nextInt();
		
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r + s) / 2;
		
		
		System.out.println( "O valor de d é: " + d);
	}
}
