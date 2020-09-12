package projetoJavaUniversidade;

/**Classe filha professor recebendo herança da super classe funcionario*/
public class Professor extends Funcionario {

	private String anoAdmissao;

	public Professor() {
	}
	
	//Método construtor
	public Professor(String nome, String matricula, String cpf, double salario) {
		super(nome, matricula, cpf, salario);
	}

	public String getAnoAdmissao() {
		return anoAdmissao;
	}

	public void setAnoAdmissao(String anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}

	//Metodo de imposto de renda sobrescrito
	@Override
	public double getImpostoDeRenda(double salario) {
		return super.getImpostoDeRenda(salario * 0.20);
	}

	//Como vai ser impresso o resultado na tela
	@Override
	public String toString() {
		return "\n Nome: " + getNome() + "\nAno de Admissao: " + anoAdmissao + "\nMatricula: "
				+ getMatricula() + "\nCpf: " + getCpf() + "\nSalario: " + getSalario()+ "\n";
	}
	
	

}
