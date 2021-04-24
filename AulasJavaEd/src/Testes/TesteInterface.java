package Testes;

import Classes.ParticipanteForum;

public class TesteInterface {

	public static void main(String[] args) {
		ParticipanteForum participante = new ParticipanteForum(); //estanciar
		Leitor leitor = participante;
		Programador programador = participante;
		String java = "Java";
		programador.pensando(java.toCharArray());
		System.out.println("O participante está lendo: " + leitor.lendo() + ", e programando: " + programador.digitando());
	}

}
