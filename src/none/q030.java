package at3;
import java.util.*;
public class q030 {

	/**
	 * l� c�digo, altura e peso dos clientes e devolve o mais alto, mais baixo, mais
	 * gordo e mais magro e a m�dia de altura e peso, sendo que o n�mero 0 gera 
	 * o relat�rio
	 */
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		double codigo=0, altura=0, peso=0, alto=0, baixo=0, gordo=0, magro=0, mediaAltura=0, mediaPeso=0, contador=0;
		boolean ficarNoLoop=true;
		System.out.println("Informe o c�digo, altura e peso.");
		while (ficarNoLoop) {
			System.out.print("C�digo: ");
			codigo=entrada.nextDouble();
			if (codigo==0) {
				ficarNoLoop=false;
				System.out.println("\nMais alto: "+alto);
				System.out.println("Mais baixo: "+baixo);
				System.out.println("Mais gordo: "+gordo);
				System.out.println("Mais magro: "+magro);
				System.out.println("M�dia de altura "+ (altura/contador));
				System.out.println("M�dia de peso "+ (peso/contador));
			}
			 else {
				System.out.print("Altura: ");
				altura=entrada.nextDouble();
				System.out.print("Peso: ");
				peso=entrada.nextDouble();
				contador++;
				if (alto==0) {
					alto=altura;
				} else if (altura>alto) {
					alto=altura;
				}
				if (baixo==0) {
					baixo=alto;
				} else if (altura<baixo) {
					baixo=altura;
				}
				if (gordo==0) {
					gordo=peso;
				} else if (peso>gordo) {
					gordo=peso;
				}
				if (magro==0) {
					magro=gordo;
				} else if (peso<magro) {
					magro=peso;
				}
			}
		}
	}
	
}
