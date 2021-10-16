package at3;
import java.util.*;
public class q034 {

	/**
	 * l� N n�meros e devolve a quantidade em intervalos, sendo que um n�mero
	 * negativo gera o relat�rio.
	 * 	0 a 25
	 * 	26 a 50
	 * 	51 a 75
	 *	76 a 100
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0, faixa0a25=0, faixa26a50=0, faixa51a75=0, faixa76a100=0;
		boolean ficarNoLoop=true;
		System.out.println("Informe um n�mero inteiro positivo para o relat�rio ou um negativo para sair");
		while (ficarNoLoop) {
			System.out.print("N�mero: ");
			numero=entrada.nextInt();
			if (numero>0 && numero<26) {
				faixa0a25++;
			} else if (numero>26 && numero<51) {
				faixa26a50++;
			} else if (numero>51 && numero<76) {
				faixa51a75++;				
			} else if (numero>76 && numero<101) {
				faixa76a100++;
			} else if (numero<0) {
				ficarNoLoop=false;
			} else {
				System.out.println("O sistema n�o aceita n�mero acima de 100");
			}
		}
		// relatorio
		System.out.println("\nRelat�rio dos n�meros conforme os intervalos previstos");
		System.out.println("Faixa de 0 a 25....: "+faixa0a25);
		System.out.println("Faixa de 26 a 50...: "+faixa26a50);
		System.out.println("Faixa de 51 a 75...: "+faixa51a75);
		System.out.println("Faixa de 76 a 100..: "+faixa76a100);		
	}
}
