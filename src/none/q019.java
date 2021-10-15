package at3;
import java.util.*;
public class q019 {
	
	/**
	 * lê um número e devolve seus número primos e o número de divisões
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0, contador=0;
		boolean primo=true;
		System.out.println("Informe um número inteiro");
		System.out.print("Número: ");
		numero=entrada.nextInt();
		
		System.out.print("Este número é divisível por: ");
		for (int i=2; i<numero; i++) {
			if (numero % i==0) { 
				System.out.print(i+", ");
				contador++;
			}				
		}
			System.out.println("1 e por si mesmo.");
			System.out.println("Total de divisões: "+(contador+2));
	}	
}
