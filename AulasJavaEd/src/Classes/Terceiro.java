package Classes;

public class Terceiro extends Funcionario1{
	//atributos: é/ tem/ estar
	private String nome;
	private int matricula;
	private int horasTrabalhadas;
	private double valorporHora;
	private double salario;
	
	//construtor
	public Terceiro(String nome, int matricula, int horasTrabalhadas, double valorporHora, double salario) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorporHora = valorporHora;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorporHora() {
		return valorporHora;
	}


	public void setValorporHora(double valorporHora) {
		this.valorporHora = valorporHora;
	}

	//metodos: o que a classe faz
	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
}
