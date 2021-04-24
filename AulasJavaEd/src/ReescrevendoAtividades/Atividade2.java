package ReescrevendoAtividades;

import java.util.*;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, anos, meses, dias;
		System.out.println("Digite sua idade em dias: ");
		idade = ler.nextInt();
		
		anos = idade / 365;
		meses = (idade % 365) / 30;
		dias = (idade % 365) % 30;
		
		System.out.println("Sua idade em anos é de: " + anos + " anos, " + meses + " meses, " + " e " + dias + " dias. :)");

	}

}
