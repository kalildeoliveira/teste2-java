package at3;
import java.util.*;
public class q014 {
	
	/**
	 * lê comando para gerar a série n/m, sendo
	 * 	n=números naturais e m=números ímpares em sequência 
	 *	(n+1)/(m+2)
	 */
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		int naturais=0, impares=-1, contador=0;
		boolean ficarNoLoop=true;
		String opcao="", s="s";
		
		System.out.println("Digite \"s\" para gerar a série.");
		System.out.print("Opção: ");
		opcao=entrada.next();
		
		if (opcao.equals(s)) {
			System.out.println("Informe um limite de números a exibir. Ex.: 10.");
			System.out.print("Número: ");
			contador=entrada.nextInt();
			System.out.print("S= ");
			do {
				naturais=naturais+1;
				impares=impares+2;
					if (contador>1) {
					System.out.print(naturais+"/"+impares+" + ");
					} else if (contador==1) {
						System.out.print(naturais+"/"+impares+ "  FIM!");
						ficarNoLoop=false;
				} contador--;				
			} while (ficarNoLoop); 
		} else {
			System.out.println("\nFim do Programa");
		}
	}
}
