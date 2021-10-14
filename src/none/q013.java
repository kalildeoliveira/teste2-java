package at3;
import java.util.*;
public class q013 {
	
	/**
	 * lê um número e devolve o seu fatorial.
	 */
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		int numero=0, fatorial=0, contador=0;
		boolean ficarNoLoop=true;
		
		System.out.println("Informe o número para o cálculo do fatorial.");
		System.out.print("Número: ");
		numero = entrada.nextInt();
		System.out.print("O fatorial de "+numero+" é: ");
		contador=numero;
		while (ficarNoLoop) {
			fatorial=numero*(contador-1);
			numero=fatorial;
			contador--;
			if (contador==1) {
				ficarNoLoop=false;
			}
		}
		System.out.print(fatorial);
	}
}
