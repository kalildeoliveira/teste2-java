package at3;
import java.util.*;
public class q023 {
	
	/**
	 * l� n�mero de alunos e turmas e devolve turmas de at� 40 alunos
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);		
		int alunos=0;		
		System.out.println("Informe a quantidade de alunos");
		System.out.print("Alunos: ");
		alunos=entrada.nextInt();
		System.out.println("Informe a quantidade de turmas");		
		System.out.println("Com a quantidade de alunos informada necess�rio a abertura de no m�nimo ");
		System.out.println(alunos/40 + " turmas de at� 40 alunos");		
	}
}
