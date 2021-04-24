package Classes;

public class Funcionario extends Pessoa {
		private String departamento;
		
		//construtor
		
		public Funcionario(String nome, int matricula, String departamento)
		{
			super(nome, matricula);
			this.departamento = departamento;
		}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
}
