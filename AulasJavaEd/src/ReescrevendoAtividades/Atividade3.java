package ReescrevendoAtividades;

import java.util.*;

public class Atividade3 {
	
	public static void main (String[] args)
	{
		
		Scanner ler = new Scanner(System.in);
		int tempoDuracao, horas, minutos, segundos;
		System.out.println("Digite o tempo de duração em segundos: ");
		tempoDuracao = ler.nextInt();
		
		horas = tempoDuracao / 3600;
		minutos = (tempoDuracao & 3600);
		segundos = (tempoDuracao % 3600) % 60;
		
		System.out.println( horas + " hora[s], " + minutos + " minuto[s] " + "e " + segundos + " segundo[s].");
	}

}
