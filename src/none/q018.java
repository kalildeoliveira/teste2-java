package at3;
import java.util.*;
public class q018 {
	
	/**
	 * l� um n�mero e devolve sua divisibilidade se n�o for primo( 1, 2, 3, 5, 7 etc)
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
			System.out.print("O n�mero n�o � primo, pois � divis�vel por: ");
			for (int i=2; i<numero; i++) {
				if (numero % i == 0) {
					System.out.print(i +" , ");
				}
			}
			System.out.println(" 1 e si mesmo.");
		}
		
	}
}
