package none;
import java.util.*;
public class q005 {

	/**
	 * l� comando e devolve a ordem de 1 a 20
	 * 	a)  um abaixo do outro para
	 * depois ler novo comando e devolve esta ordem
	 * 	b)  um ao lado do outro
	 */

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 String [] nome = new String [21];
		 String opcao = "", l="l";
		 
		 // Populando o Vetor
		 for (int i=1; i<=20;i++) {
			 System.out.print("N�mero "+i+": ");
			 nome[i] = entrada.next();
		 }
		 
		 // Imprimindo n�meros embaixo
		 System.out.println("\n\nOs n�meros digitados foram: \n");
		 for (int i=1; i<=20; i++) {
			 System.out.println(nome[i]);
		 }
		 
		 // Alterar para impress�o um ao lado do outro
		 System.out.println("\nPressione \"l\" para exibir lado a lado");
		 System.out.print("Op��o: ");
		 opcao = entrada.next();
		 if (opcao.equals(l)) {		 
			 for (int i=1; i<=20; i++) {
				 if (i>0 && i<20) {
				 System.out.print(nome[i]+" , ");
				 } else { 
					 System.out.print(nome[i]);
				 }
			 }
		 }
		 System.out.println("\nFim do Programa.");
	}
}
