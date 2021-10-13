package none;
import java.util.*;
public class q009 {

	/**
	 * lê um número e devolve a tabuada desse número 
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0;
		System.out.println("Informe um número para o sistema gerar uma tabuada.");
		System.out.print ("Número: ");
		numero = entrada.nextInt();
		System.out.println("\nTabuada do "+numero);
		for (int i=1; i<=10; i++) {
			System.out.println(numero+" x "+i+" = "+numero*i);
		}
	}
}