package at3;
import java.util.*;
public class q016 {
	
	/**
	 * l� um conjunto de n�meros e devolve o menor, maior e a soma deles.
	 */

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int maior=0, menor=0, tamanho=0, soma=0, contador=0, i=1;
		boolean ficarNoLoop=true;
		System.out.println("Este sistema recebe n�meros e calcula o maior/menor e a soma.");
		System.out.println("Informe quantos n�meros deseja digitar. Ex.: \"10\"");
		System.out.print("Op��o: ");
		tamanho=entrada.nextInt();
		int[] numero = new int [tamanho+2];
		contador=tamanho;
		while (ficarNoLoop) {
			System.out.print("N�mero ["+i+"]: ");
			numero[i]=entrada.nextInt();
			soma=soma+numero[i];			
			if (contador==1) {
				ficarNoLoop=false;
			}
			contador--; i++;
		}
		contador=tamanho;
		i=1;
		ficarNoLoop=true;
		while (ficarNoLoop) {
			if (maior==0) {
				maior=numero[i];
			} else if (numero[i]>maior) {
				maior=numero[i];
			}
			if (contador==1) {
				ficarNoLoop=false;
			}
			contador--; i++;
		}
		contador=tamanho;
		i=1;
		ficarNoLoop=true;
		while (ficarNoLoop) {
			if (menor==0) {
				menor=maior;
			} else if (numero[i]<menor) {
				menor=numero[i];
			}
			if (contador==1) {
				ficarNoLoop=false;
			}
			contador--; i++;
		}
		System.out.println("O maior n�mero � "+maior+" o menor n�mero � "+menor+" e a soma � "+soma);
		
	}
	
}
