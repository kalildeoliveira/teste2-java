package none;

import java.util.Scanner;

public class q001 {

	/**
	 * l� uma nota de zero a 10 em uma loop at� que a condi��o seja atendida
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero=0;		
		do {
			System.out.println("Informe uma nota entre 0 e 10");
			System.out.print("N�mero: ");
			numero = entrada.nextDouble();
			if (!(numero>=0 && numero<=10)) { 
				System.out.println("Tente novamente!");
			}
		} while (!(numero>=0 && numero<=10));
		System.out.println("\nPrograma encerrado.");
	} 
}
