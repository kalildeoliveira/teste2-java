package at3;
import java.util.*;
public class q029 {

	/**
	 * l� um n�mero e a posi��o inicial e final e devolve a tabuada desse n�mero. 
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0, posicaoInicial=0, posicaoFinal=0;
		System.out.println("Informe um n�mero para o sistema gerar uma tabuada.");
		System.out.print ("N�mero: ");
		numero = entrada.nextInt();
		System.out.println("Agora informe a posi��o inicial e final da tabuada.");
		System.out.print("Posi��o inicial: ");
		posicaoInicial = entrada.nextInt();
		System.out.print("Posi��o final: ");
		posicaoFinal = entrada.nextInt();
		System.out.println("\nTabuada do "+numero);
		for (int i=1; i<=10; i++) {
			if (i>=posicaoInicial && i<=posicaoFinal) {
				System.out.println(numero+" x "+i+" = "+numero*i);
			}
		}
	}
}