package projetoJavaUniversidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	/**Classe de teste*/
public class TesteUniversidade {

	public static void main(String[] args) {

		int opcao; //variável de controle do menu de seleção

		List<Professor> professores = new ArrayList<Professor>(); //lista de Professores
		List<Diretor> diretores = new ArrayList<Diretor>();  //lista de Diretores
		
		Scanner ler = new Scanner(System.in);
		double totalP = 0; //faz a contagem do total de imposto dos professores
		double totalD = 0;
		int cont1 = 0; //faz a contagem da quantidade de professores cadastrados
		int cont2 = 0;
		double mediaFinal = 0; 
		double totalImposto = 0; 
		
		do {

			/***Menu de seleção*/
			System.out.println("\n \nQual tipo de funcionário deseja informar?\n1 - Professor \n2 - Diretor"
					+ "\n3 - Para Sair digite 3 a qualquer momento");
				opcao = Integer.parseInt(ler.nextLine());
			
			switch(opcao){

			
			
			case 1:	
					Professor professor = new Professor();
					
					System.out.println("Informe o Nome do Professor:");
					professor.setNome(new Scanner(System.in).nextLine());

					System.out.println("Informe a Matricula:");
					professor.setMatricula(new Scanner(System.in).nextLine());

					System.out.println("Informe o CPF:");
					professor.setCpf(new Scanner(System.in).nextLine());

					System.out.println("Informe o ano de admissão:");
					professor.setAnoAdmissao(new Scanner(System.in).nextLine());

					System.out.println("Informe o Salario:");
					professor.setSalario(new Scanner(System.in).nextDouble());

					
					System.out.println("Imposto de renda: " + professor.getImpostoDeRenda(professor.getSalario()));
					
					totalP += professor.getImpostoDeRenda(professor.getSalario());
					cont1++;
					professores.add(professor);
					
					break;
					

			case 2:
					Diretor diretor = new Diretor();
					
					System.out.println("Informe o Nome:");
					diretor.setNome(new Scanner(System.in).nextLine());

					System.out.println("Informe o Matricula:");
					diretor.setMatricula(new Scanner(System.in).nextLine());

					System.out.println("Informe o CPF:");
					diretor.setCpf(new Scanner(System.in).nextLine());

					System.out.println("Informe o Salario:");
					diretor.setSalario(new Scanner(System.in).nextDouble());

					System.out.println("Informe o tempo de casa em anos:");
					diretor.setTempoCasa(new Scanner(System.in).nextInt());

					System.out.println("Imposto de renda: " + diretor.getImpostoDeRenda(diretor.getSalario()));
					
					totalD += diretor.getImpostoDeRenda(diretor.getSalario());
					cont2++;
					diretores.add(diretor);
					
					
					break;

			case 3:
				System.out.println("Finalizando cadastro, os dados serão impressos a seguir");
				break;
				
			default:
				System.out.println("ERRO - Você informou uma entrada incorreta, informe os dados novamente");
				
			}

		}while (opcao!=3);
		
		
		new Thread();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nLista de professores cadastrados: \n"+ professores);
		
		System.out.println("\n----------------------------------------------------------------\n");
		System.out.println("\nLista de diretores cadastrados: "+ diretores);
		

		
		mediaFinal = (totalD + totalP) / (cont2+cont1);
		totalImposto = totalD + totalP;
		System.out.println("Media imposto de renda dos funcionários: R$" + mediaFinal);
		System.out.println("Total do imposto de renda: R$" + totalImposto);
	}
}