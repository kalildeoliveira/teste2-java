package at3;
import java.util.*;
import java.lang.Math.*;
public class q038 {

	/**
	 * l� um n�mero inteiro e devolve este n�mero invertido
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);		
		int numero=0, auxiliar=0, novoNumero=0, contador=0;
		double troca=0;
		boolean ficarNoLoop=true;
		System.out.println("Informe um n�mero inteiro.");
		System.out.println("N�mero: ");
		numero=entrada.nextInt();
		auxiliar=numero;
		while (ficarNoLoop) {
			auxiliar=auxiliar/10;
			contador++;			
			if (auxiliar==0) {
				ficarNoLoop=false;
			}
		}
		auxiliar=numero;
		for (int i=1; i<=contador; i++) {
			auxiliar=numero%10;
			novoNumero=auxiliar;
			auxiliar=numero;
			numero=auxiliar/10;
			System.out.print(novoNumero);
		}
	}
}
