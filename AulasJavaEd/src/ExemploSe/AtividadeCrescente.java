package ExemploSe;

import java.util.Scanner;

public class AtividadeCrescente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite o primeiro nUmero: ");
		a = ler.nextInt();
		System.out.println("Digite o segundo nUmero: ");
		b = ler.nextInt();
		System.out.println("Digite o terceiro nUmero: ");
		c = ler.nextInt();
		
		if (a < b && a < c) {
			if (b < c) {
				System.out.println(a +  " - " + b + " - " + c);
			} else {
				System.out.println(a +  " - " + c + " - " + b);
			}			
		} else if (b < a && b < c) {
			if (a < c) {
				System.out.println(b +  " - " + a + " - " + c);
			} else {
				System.out.println(b +  " - " + c + " - " + a);
			}
		} else if (c < a && c < b) {
			if (a < b) {
				System.out.println(c +  " - " + a + " - " + b);
			} else {
				System.out.println(c +  " - " + b + " - " + a);
			}
		}
	}
		

}
