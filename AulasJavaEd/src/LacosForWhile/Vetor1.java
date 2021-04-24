package LacosForWhile;

import java.util.*;

public class Vetor1 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		int[] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
		int[] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};
		
		double[] nota = new double[5];
				
				//tamanho do array
		if (arrayDois.length > 8) {
			System.out.println("Tamanho do ArrayDois - Maior que 8!");
		} else {
			System.out.println("Tamanho do ArrayDois - Menor que 8!");
			   }
		System.out.println("\nTamanho do ArrayDois = " + arrayUm.length);
		
		String[] cars = {"Volvo", "Ford", "Mazda"};
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		//populando array
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com uma nota: ");
			nota [i] = ler.nextDouble();
		}
		
		//apresentado um array
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nota " + i + 1 + " = " + nota[i]);
		}

	}

}
