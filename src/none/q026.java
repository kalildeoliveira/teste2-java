package at3;
import java.util.*;
public class q026 {
	
	/**
	 * l� comando que cria tabela de pre�os de 1 a 50 produtos de 0.18
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);		
		double valor=0;
		String opcao="", tabela="t";
		System.out.println("Digite \"t\" para gerar a tabela de pre�o");
		System.out.print("Op��o: ");
		opcao=entrada.next();
		if (opcao.equals(tabela)) {
			System.out.println("\nPanificadora P�o de Ontem - Tabela de pre�os");			
			for (int i=1; i<=50; i++) {
				System.out.println(i+"- "+i*0.18);
			}
		} else { 
			System.out.println("\nPrograma encerrado.");
		}
	}
}
