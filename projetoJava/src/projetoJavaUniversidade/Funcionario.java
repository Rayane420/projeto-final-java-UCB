package projetoJavaUniversidade;

/**Super classe Funcionario*/
public class Funcionario {

	private String nome;
	
	private String matricula;
	
	private String cpf;
	
	private double salario;

	public Funcionario() {
	}
	
	//Método construtor
	public Funcionario(String nome, String matricula, String cpf, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	//Encapsulamento dos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	public double getImpostoDeRenda(double salario) {
		return salario;
	}

	
	
	
	
}
