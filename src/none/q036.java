package at3;
import java.util.*;
public class q036 {

	/**
	 * lê votos para 4 candidatos, brancos e nulos e devolve
	 * 	total de votos
	 *	total de nulos
	 *	total de brancos
	 *	percentual de nulos sobre o total de votos
	 * 	percentual de brancos sobre o total de votos
	 * sendo que o número 0 gera o relatório. Considerar
	 * 	1 - Candidato 1
	 *	2 - Candidato 2
	 *	3 - Candidato 3
	 *	4 - Candidato 4
	 *	5 - Voto Nulo
	 *	6 - Voto em Branco
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		String candidato1="1", candidato2="2", candidato3="3", candidato4="4", nulos="5", brancos="6", sair="0", opcao="";
		int totalVotos=0, votosCandidato1=0, votosCandidato2=0, votosCandidato3=0, votosCandidato4=0, votosBrancos=0, votosNulos=0;
		boolean ficarNoLoop=true;
		
		// Entrada de dados
		while (ficarNoLoop) {
			System.out.println("Digite o seu voto conforme a tabela abaixo.");
			System.out.println("\t\"1\" - Candidato 1\n"+
							 "\t\"2\" - Candidato 2\n"+
							 "\t\"3\" - Candidato 3\n"+
							 "\t\"4\" - Candidato 4\n"+
							 "\t\"5\" - Voto Nulo\n"+
							 "\t\"6\" - Voto em Branco\n"+
							 "\t\"0\" - Finalizar a votação");
			System.out.print("Opção: ");
			opcao=entrada.next();
			
			// Atribuindo o voto			
			if (opcao.equals(candidato1)) {
				votosCandidato1++;
			} else if (opcao.equals(candidato2)) {
				votosCandidato2++;
			} else if (opcao.equals(candidato3)) {
				votosCandidato3++;
			} else if (opcao.equals(candidato4)) {
				votosCandidato4++;
			} else if (opcao.equals(nulos)) {
				votosNulos++;
			} else if (opcao.equals(brancos)) {
				votosBrancos++;
			} else if (opcao.equals(sair)) {				
				ficarNoLoop=false;
			} else {
				System.out.println("\nOpção inválida!");
			}
		}
		System.out.println("\n:::::::::::: RELATÓRIO DA ELEIÇÃO ::::::::::::::");
		// Total de votos
		totalVotos=(votosCandidato1+votosCandidato2+votosCandidato3+votosCandidato4+votosBrancos+votosNulos);
		System.out.println("Total de votos: "+totalVotos);
		
		
		// Total de votos nulos
		System.out.println("Votos nulos:"+votosNulos);
		
		// Total de votos brancos
		System.out.println("Votos brancos:"+votosBrancos);
		
		// Percentual de votos nulos 
		System.out.println("Percentual de Nulos: "+((votosNulos*100)/totalVotos));
		
		// Percentual de votos brancos
		System.out.println("Percentual de Brancos: "+((votosBrancos*100)/totalVotos));
	}
}
