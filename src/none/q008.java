package none;
import java.util.*;
public class q008 {

	/**
	 * l� dois n�meros inteiros e devolve os n�meros do intervalo entre eles separados e somados
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1=0, numero2=0, soma=0;
		System.out.println("Informe dois n�meros inteiros diferentes.");
		System.out.print("N�mero 1: ");
		numero1 = entrada.nextInt();
		System.out.print("N�mero 2: ");
		numero2 = entrada.nextInt();
		if (numero1>numero2) {
			System.out.println("Os n�meros no intervalo entre "+numero1+" e "+numero2+" s�o: ");
			if (numero1-numero2 == 1) { 
						System.out.println("N�o h� intervalo entre eles");
			}
			while (numero1>(numero2+1)) { 
					++numero2;
					soma=numero2+soma;
					System.out.println (numero2);
					
				} System.out.println("Somados s�o: "+soma);
		} else if (numero2>numero1) {
			System.out.println("Os n�meros no intervalo entre "+numero1+" e "+numero2+" s�o: ");
			if (numero2-numero1 == 1) { 
				System.out.println("N�o h� intervalo entre eles");
			}
			while (numero2>(numero1+1)) { 
				++numero1;
				soma=numero1+soma;
				System.out.println (numero1);
			} System.out.println("Somados s�o: "+soma);
			} else { 
				System.out.println("Os n�meros s�o iguais!");
				}
		}
	}
