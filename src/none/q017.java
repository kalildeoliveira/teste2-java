package at3;
import java.util.*;
public class q017 {
	
	/**
	 * l� um n�mero e devolve se � primo.
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0;
		boolean primo=true;
		System.out.println("Informe um n�mero inteiro");
		System.out.print("N�mero: ");
		numero=entrada.nextInt();
		for (int i=2; i<numero; i++) {
			if (numero % i == 0) {
				primo=false;
			}
		}
		if (primo) {
			System.out.println("� primo");
		} else {
			System.out.println("N�o � primo");
		}
		
	}
}
