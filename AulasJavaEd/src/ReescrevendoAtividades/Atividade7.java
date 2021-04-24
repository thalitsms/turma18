package ReescrevendoAtividades;

import java.util.*;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, et, f, x, y;
		
		System.out.println("Digite o valor de x1: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de x2: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de y1: ");
		c = ler.nextInt();
		
		System.out.println("Digite o valor de y2: ");
		d = ler.nextInt();
		System.out.println("Digite o valor de y2: ");
		et = ler.nextInt();
		System.out.println("Digite o valor de y2: ");
		f = ler.nextInt();
		
		
		x = ((c * et) - (b * f)) / ((a * et) - (b * d));
		y = ((a * f) - (c * d)) / ((a * et) - (b * d));
		
		
		
		System.out.println( "O valor de x é: " +  x);
		System.out.println( "O valor de y é: " +  x);
	}

}
