package at3;
import java.util.*;
public class q018 {
	
	/**
	 * lê um número e devolve sua divisibilidade se não for primo( 1, 2, 3, 5, 7 etc)
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
			System.out.print("O número não é primo, pois é divisível por: ");
			for (int i=2; i<numero; i++) {
				if (numero % i == 0) {
					System.out.print(i +" , ");
				}
			}
			System.out.println(" 1 e si mesmo.");
		}
		
	}
}
