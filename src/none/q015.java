package at3;
import java.util.*;
public class q015 {
	
	 /**
	 * lê o comando e devolve a série (k*m)/n, sendo
	 * 	k = números sequenciais de 37 a 1
	 * 	m = números sequenciais de 38 a 2 
	 * 	n = números sequenciais de 1 a 37
	 * 	(k-1*m-1)/n+1 + (k-2*m-2)/n+2 … 
	 */
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		int k=37, m=38, n=1, acumula=0, resultado=0;
		boolean ficarNoLoop=true;
		String opcao="", s="s";		
		
		System.out.println("Digite \"s\" para gerar a série.");
		System.out.print("Opção: ");
		opcao=entrada.next();
		
		if (opcao.equals(s)) {			
			System.out.print("S= ");
			do {
				if (k>1) {
					System.out.print ("("+k+"*"+m+")"+"/"+n+" + ");					
				} else if (k==1) {
					System.out.println ("("+k+"*"+m+")"+"/"+n);
					ficarNoLoop=false;
				}
				resultado=(k*m)/n;
				acumula=resultado+acumula;
				k--;m--;n++;
			} while (ficarNoLoop); 
			System.out.println("Resultado: "+ acumula);
		} else {
			System.out.println("\nFim do Programa");
		}
	}
}
