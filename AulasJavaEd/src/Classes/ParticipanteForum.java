package Classes;

import Testes.Leitor;
import Testes.Programador;

public class ParticipanteForum implements Leitor, Programador{
		String pensamento;
		public String lendo()
		{
			return "Forum";
		}
		
		public void pensando(char[] ideias)
		{
			pensamento = new String(ideias);// estanciar
		}
		
		public String digitando()
		{
			return pensamento;
		}
		
		private String aprendendo()
		{
			return "Java";
		}
		
		
}
