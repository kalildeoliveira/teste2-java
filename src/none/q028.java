package at3;
import java.util.*;
public class q028 {
	/**
	 * l� N temperaturas e devolve a menor, maior e a m�dia;
	 */
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		double temperatura=0, maior=0, menor=0, media=0;
		boolean ficarNoLoop=true;
		int contador=0;
		System.out.println("Informe uma temperatura ou digite \"0\" para sair");
		while (ficarNoLoop) {
			System.out.print("Temperatura: ");
			temperatura=entrada.nextDouble();
			media=media+temperatura;
			contador++;
			if (temperatura==0) {
				ficarNoLoop=false;
			} else { 
				if (maior==0) {
					maior=temperatura;
				} else if (temperatura>maior) { 
					maior=temperatura; 
				}
				if (menor==0) {
					menor=maior;
				} else if (temperatura<menor) {
					menor=temperatura;
				}
			}
		}
		System.out.print("\nA maior temperatura � "+maior);
		System.out.print(", a menor �"+menor);
		System.out.print(" e a m�dia � "+(media/contador));
	}
}
