package none;
import java.util.*;
public class q009 {

	/**
	 * l� um n�mero e devolve a tabuada desse n�mero 
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0;
		System.out.println("Informe um n�mero para o sistema gerar uma tabuada.");
		System.out.print ("N�mero: ");
		numero = entrada.nextInt();
		System.out.println("\nTabuada do "+numero);
		for (int i=1; i<=10; i++) {
			System.out.println(numero+" x "+i+" = "+numero*i);
		}
	}
}