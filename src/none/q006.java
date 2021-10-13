package none;
import java.util.*;
public class q006 {

	/**
	 * lê comando e devolve os números ímpares entre 1 e 50. 
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner((System.in));
		String opcao="", r="r";
		int [] numero = new int [52];
		System.out.println("Digite \"r\" para gerar relação de números ímpares de 1 a 50");
		System.out.print("Opção: ");
		opcao = entrada.next();
		if (opcao.equals(r)) {
		for (int i=1; i<=50;) {
			System.out.print("\n "+i+": ");
			i=i+2;
			numero[i] = i;
		}} else {
			System.out.println("\n\nFim do Programa.");
		}
	}
}
