package at3;
import java.util.*;
public class q037 {

	/**
	 * lê resposta de 10 questões objetivas de N alunos e devolve
	 * 	total de pontos por aluno
	 *	maior e menor acerto
	 *	total de participantes da prova
	 *	média da turma
	 * sendo que o professor poderá optar pelo gabarito ou usar o padrão:
	 * 	1 - A
	 *	2 - B
	 *	3 - C
	 *	4 - D
	 *	5 - E
	 *	6 - E
	 *	7 - D
	 *	8 - C
	 *	9 - B
	 *	10 - A
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		String resposta="", alunoMaiorAcerto="", alunoMenorAcerto="";
		String []questao=new String[11];
		int totalPontos=0, totalPontosTurma=0, maiorAcerto=0, menorAcerto=0, quantidade=0;
		int [] acerto = new int[11];
		int [] acertoAluno = new int[11];

		// inicializando os vetores
		for (int v=0; v<=10; v++) {
			acerto[v]=0; 
			acertoAluno[v]=0;
		}
		double mediaTurma;
		boolean ficarNoLoop=true;
		
		// Gabarito
		questao[1]="a";
		questao[2]="b";
		questao[3]="c";
		questao[4]="d";
		questao[5]="e";
		questao[6]="e";
		questao[7]="d";
		questao[8]="c"; 
		questao[9]="b";
		questao[10]="a";
		
		// Quantidade de participantes
		System.out.println("Informe a quantidade de participantes");
		System.out.print("Quantidade: ");
		quantidade=entrada.nextInt();
		String aluno[]= new String[quantidade+1];
		for (int j=1; j<=quantidade; j++) {
			System.out.println("Qual o seu nome?");
			System.out.print("Resposta: ");
			aluno[j]=entrada.next();
			
		// Resposta dos alunos
						
				System.out.println("Você responderá 10 questões objetivas com 5 alternativas, sendo\n"
							+ "\t\"a\" - alternativa A\n"
							+ "\t\"b\" - alternativa B\n"
							+ "\t\"c\" - alternativa C\n"
							+ "\t\"d\" - alternativa D\n"
							+ "\t\"e\" - alternativa E\n");
				for (int i=1;i<=10;i++) {
					System.out.println("Pergunta "+i);
					System.out.print("Resposta: ");
					resposta=entrada.next();
					if (resposta.equals(questao[i])) {						
						acerto[i]=1;
						totalPontos=totalPontos+acerto[i];
					}
					
				}
				acertoAluno[j]=totalPontos;
				totalPontos=0;
				totalPontosTurma=totalPontosTurma+acertoAluno[j];
				if (maiorAcerto==0) {
					maiorAcerto=acertoAluno[j];
					alunoMaiorAcerto = aluno[j];
				} else if (acertoAluno[j]>maiorAcerto) {
					maiorAcerto = acertoAluno[j];
					alunoMaiorAcerto = aluno[j];
				}
				if (menorAcerto==0) {
					menorAcerto=maiorAcerto;
					alunoMenorAcerto = aluno[j];
				} else if (acertoAluno[j]<menorAcerto) {
					menorAcerto=acertoAluno[j];
					alunoMenorAcerto = aluno[j];
				}
		}
	
	// Relatório
			System.out.println("\n::::::: RELATÓRIO DA PROVA :::::::::");
			System.out.println("Total de Participantes: "+quantidade+" alunos");
			for (int k=1; k<=quantidade; k++) {
				System.out.println("Nome do participante: "+aluno[k]);
				System.out.println("Pontos: "+acertoAluno[k]);	
			}
			System.out.println("Maior acerto foi de "+alunoMaiorAcerto+" com "+maiorAcerto+" pontos");
			System.out.println("Menor acerto foi de "+alunoMenorAcerto+" com "+menorAcerto+" pontos");
			System.out.println("\nMédia de pontos da turma: "+(totalPontosTurma/quantidade));
			
	}
}
