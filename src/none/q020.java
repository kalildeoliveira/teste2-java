package at3;
import java.util.*;
public class q020 {
	
	/**
	 *  l� N n�meros e devolve a m�dia.
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		double limite=0, soma=0, nota=0;		
		System.out.println("Informe o n�mero de notas que deseja informar. Ex.: 4");
		System.out.print("N�mero: ");
		limite=entrada.nextInt();				
		for (int i=1; i<=limite; i++) {
			System.out.print("Nota["+i+"]: ");
			nota=entrada.nextInt();
			soma=soma+nota;
		}
		System.out.println("A m�dia � "+(soma/limite));
	}	
}
