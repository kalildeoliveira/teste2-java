package none;
import java.util.*;
public class q011 {

	/**
	 * lê 10 números inteiros e devolve a quantidade de pares e ímpares
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int pares=0, impares=0, numero=0;
		System.out.println("Informe dez números inteiros.");
		for (int i=1; i<=10;i++) {
			System.out.print("Número "+i+": ");
			numero = entrada.nextInt();
			if (numero%2==0) {
				pares++;
			} else { 
				impares++;
			}
		}
		System.out.println("São "+pares+" números pares");
		System.out.println("São "+impares+" números ímpares");
	}
}
