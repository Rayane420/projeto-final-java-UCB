package projetoJavaUniversidade;

/**Classe filha diretor recebendo herança da super classe funcionario*/
public class Diretor extends Funcionario{
	
	private int tempoCasa;
	
	public Diretor() {
	}
	
	//Método construtor
	public Diretor(String nome, String matricula, String cpf, double salario) {
		super(nome, matricula, cpf, salario);
	}

	
	public int getTempoCasa() {
		return tempoCasa;
	}



	public void setTempoCasa(int tempoCasa) {
		this.tempoCasa = tempoCasa;
	}

	//Metodo de imposto de renda sobrescrito
	@Override
	public double getImpostoDeRenda(double salario) {
		return super.getImpostoDeRenda(salario * 0.23);
	}

	//Como vai ser impresso o resultado na tela
	@Override
	public String toString() {
		return "\nNome: " + getNome() + "\nTempo de Casa: " + tempoCasa + "\nMatricula: " + getMatricula()
				+ "\nCpf: " + getCpf() + "\nSalario: " + getSalario()+ "\n";
	}
	
	

}
