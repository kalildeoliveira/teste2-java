package at3;
import java.util.*;
public class q031 {

	/**
	 * lê número de aluno e sua altura (em cm) e devolve o mais alto e mais baixo
	 * com seu respectivo número
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int numeroAluno=0, numeroAlto=0, numeroBaixo=0;
		double altura=0, alto=0, baixo=0;		
		System.out.println("Informe numero do aluno e altura.");
		for (int i=1; i<=10; i++) {
			System.out.print("Número do aluno: ");
			numeroAluno=entrada.nextInt();
			System.out.print("Altura: ");
			altura=entrada.nextDouble();
				if (alto==0) {
					alto=altura;
					numeroAlto=numeroAluno;
				} else if (altura>alto) {
					alto=altura;
					numeroAlto=numeroAluno;
				}
				if (baixo==0) {
					baixo=alto;
					numeroBaixo=numeroAluno;
				} else if (altura<baixo) {
					baixo=altura;
					numeroBaixo=numeroAluno;
				}					
		}
		System.out.println("O aluno "+numeroAlto+" é o mais alto com "+alto+" cm");
		System.out.println("O aluno "+numeroBaixo+" é o mais baixo com "+baixo+" cm");
	}
}
