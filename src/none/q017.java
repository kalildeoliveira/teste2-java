package at3;
import java.util.*;
public class q017 {
	
	/**
	 * lê um número e devolve se é primo.
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0;
		boolean primo=true;
		System.out.println("Informe um número inteiro");
		System.out.print("Número: ");
		numero=entrada.nextInt();
		for (int i=2; i<numero; i++) {
			if (numero % i == 0) {
				primo=false;
			}
		}
		if (primo) {
			System.out.println("É primo");
		} else {
			System.out.println("Não é primo");
		}
		
	}
}
