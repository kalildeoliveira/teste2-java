package none;
import java.util.*;
public class q011 {

	/**
	 * l� 10 n�meros inteiros e devolve a quantidade de pares e �mpares
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int pares=0, impares=0, numero=0;
		System.out.println("Informe dez n�meros inteiros.");
		for (int i=1; i<=10;i++) {
			System.out.print("N�mero "+i+": ");
			numero = entrada.nextInt();
			if (numero%2==0) {
				pares++;
			} else { 
				impares++;
			}
		}
		System.out.println("S�o "+pares+" n�meros pares");
		System.out.println("S�o "+impares+" n�meros �mpares");
	}
}
