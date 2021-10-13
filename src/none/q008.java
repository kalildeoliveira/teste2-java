package none;
import java.util.*;
public class q008 {

	/**
	 * lê dois números inteiros e devolve os números do intervalo entre eles separados e somados
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1=0, numero2=0, soma=0;
		System.out.println("Informe dois números inteiros diferentes.");
		System.out.print("Número 1: ");
		numero1 = entrada.nextInt();
		System.out.print("Número 2: ");
		numero2 = entrada.nextInt();
		if (numero1>numero2) {
			System.out.println("Os números no intervalo entre "+numero1+" e "+numero2+" são: ");
			if (numero1-numero2 == 1) { 
						System.out.println("Não há intervalo entre eles");
			}
			while (numero1>(numero2+1)) { 
					++numero2;
					soma=numero2+soma;
					System.out.println (numero2);
					
				} System.out.println("Somados são: "+soma);
		} else if (numero2>numero1) {
			System.out.println("Os números no intervalo entre "+numero1+" e "+numero2+" são: ");
			if (numero2-numero1 == 1) { 
				System.out.println("Não há intervalo entre eles");
			}
			while (numero2>(numero1+1)) { 
				++numero1;
				soma=numero1+soma;
				System.out.println (numero1);
			} System.out.println("Somados são: "+soma);
			} else { 
				System.out.println("Os números são iguais!");
				}
		}
	}
