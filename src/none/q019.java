package at3;
import java.util.*;
public class q019 {
	
	/**
	 * l� um n�mero e devolve seus n�mero primos e o n�mero de divis�es
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0, contador=0;
		boolean primo=true;
		System.out.println("Informe um n�mero inteiro");
		System.out.print("N�mero: ");
		numero=entrada.nextInt();
		
		System.out.print("Este n�mero � divis�vel por: ");
		for (int i=2; i<numero; i++) {
			if (numero % i==0) { 
				System.out.print(i+", ");
				contador++;
			}				
		}
			System.out.println("1 e por si mesmo.");
			System.out.println("Total de divis�es: "+(contador+2));
	}	
}
