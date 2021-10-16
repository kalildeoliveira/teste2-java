package at3;
import java.util.*;
public class q022 {
	
	/**
	 * lê os votos de três candidatos e devolve o total de cada um.
	 */


	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		double idade=0, media=0;
		int limite=0, voto1=0, voto2=0, voto3=0;
		String candidato="", candidato1="1", candidato2="2", candidato3="3";
		System.out.println("Qual o número de votantes?");
		System.out.print("Votantes: ");
		limite=entrada.nextInt();
		for (int i=1; i<=limite; i++) {
			System.out.println("Pressione \"1\"para candidato 1, "
					+ "\"2\" para candidato 2 ou"
					+ "\3\" para candidato 3");
			System.out.print("Opção: ");	
			candidato=entrada.next();
			if (candidato.equals(candidato1)) {
				voto1++;
			} else if (candidato.equals(candidato2)) {
				voto2++;
			}
			if (candidato.equals(candidato3)) {
				voto3++;
			}			
		}
		System.out.println("\nContagem dos votos");
			System.out.println("Candidato1: "+voto1);
			System.out.println("Candidato2: "+voto2);
			System.out.println("Candidato3: "+voto3);
			System.out.println("Total...... "+(voto1+voto2+voto3));
		
		
	}
}
