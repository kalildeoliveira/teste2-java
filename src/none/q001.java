package none;

import java.util.Scanner;

public class q001 {

	/**
	 * lê uma nota de zero a 10 em uma loop até que a condição seja atendida
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero=0;		
		do {
			System.out.println("Informe uma nota entre 0 e 10");
			System.out.print("Número: ");
			numero = entrada.nextDouble();
			if (!(numero>=0 && numero<=10)) { 
				System.out.println("Tente novamente!");
			}
		} while (!(numero>=0 && numero<=10));
		System.out.println("\nPrograma encerrado.");
	} 
}
