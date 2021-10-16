package at3;
import java.util.*;
public class q029 {

	/**
	 * lê um número e a posição inicial e final e devolve a tabuada desse número. 
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0, posicaoInicial=0, posicaoFinal=0;
		System.out.println("Informe um número para o sistema gerar uma tabuada.");
		System.out.print ("Número: ");
		numero = entrada.nextInt();
		System.out.println("Agora informe a posição inicial e final da tabuada.");
		System.out.print("Posição inicial: ");
		posicaoInicial = entrada.nextInt();
		System.out.print("Posição final: ");
		posicaoFinal = entrada.nextInt();
		System.out.println("\nTabuada do "+numero);
		for (int i=1; i<=10; i++) {
			if (i>=posicaoInicial && i<=posicaoFinal) {
				System.out.println(numero+" x "+i+" = "+numero*i);
			}
		}
	}
}